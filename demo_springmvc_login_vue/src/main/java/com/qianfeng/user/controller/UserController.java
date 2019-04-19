package com.qianfeng.user.controller;

import com.qianfeng.user.exception.PasswordErrorException;
import com.qianfeng.user.exception.UsernameNotFoundException;
import com.qianfeng.user.info.UserPermissionInfo;
import com.qianfeng.user.po.ParentNode;
import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.service.UserService;
import com.qianfeng.user.vo.JsonResultVO;
import com.qianfeng.user.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")//根目录
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(LoginInfoVO loginInfoVO, HttpSession session){
        try {
            UserPermissionInfo user = userService.login(loginInfoVO);
            session.setAttribute("user",user);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
        /*重定向不会经过视图解析器*/
        return "redirect:/hello.jsp";
    }

    /**
     * 登录
     *
     * ResponseBody加上此注解，方法return的是什么，将不会做任何的处理和修饰，直接将返回的字符串给用户。
     * @param loginInfoVO
     * @param session
     * @return
     */
    @ResponseBody
    @PostMapping("/login2")
    public JsonResultVO loginAjax(LoginInfoVO loginInfoVO, HttpSession session) throws Exception{
        JsonResultVO jsonResultVO = new JsonResultVO();
//        JsonResultVO jsonResultVO = null;
        try {
            UserPermissionInfo user = userService.login(loginInfoVO);
            session.setAttribute("user",user);
            jsonResultVO.setCode(1);

//            System.out.println("--->"+user.getPermissionList().get(0));
        }
//        catch (NullPointerException e){
//            e.printStackTrace();
////            return "{code:0,msg:'请输入用户名'}";
//            jsonResultVO.setCode(0);
//            jsonResultVO.setMsg("请输入用户名");
//        }
        catch (UsernameNotFoundException|PasswordErrorException e) {
            e.printStackTrace();
//            return "{code:0,msg:'用户名或者密码错误'}";
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("用户名或者密码错误");
        }
//        catch (Exception e) {
//            e.printStackTrace();
////            return "{code:0,msg:'请联系管理员!'}";
//            jsonResultVO.setCode(0);
//            jsonResultVO.setMsg("请联系管理员");
//        }
        /*重定向不会经过视图解析器*/
        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
       return jsonResultVO;
    }

    @ResponseBody
    @RequestMapping("func")
    public List<ParentNode> queryFuncTree(HttpSession session){
        UserPermissionInfo user = (UserPermissionInfo) session.getAttribute("user");
        List<ParentNode> parentNodeList = user.getParentNodeList();
        return parentNodeList;


    }
}
