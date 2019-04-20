package com.qianfeng.user.controller;

import com.qianfeng.user.exception.PasswordErrorException;
import com.qianfeng.user.exception.UsernameNotFoundException;
import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.service.UserService;
import com.qianfeng.user.vo.JsonResultVO;
import com.qianfeng.user.vo.LoginInfoVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")//根目录
public class UserController {

//    @Autowired
//    private UserService userService;

    @PostMapping("/login")
    public String login(LoginInfoVO loginInfoVO, HttpSession session){
//        try {
//            TbUser user = userService.login(loginInfoVO);
//            session.setAttribute("user",user);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "redirect:/login.jsp";
//        }
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
    public JsonResultVO loginAjax(LoginInfoVO loginInfoVO, HttpSession session){
        JsonResultVO jsonResultVO = new JsonResultVO();

        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(loginInfoVO.getUsername(),loginInfoVO.getPassword()));
            jsonResultVO.setCode(1);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("登录失败，用户名或者密码错误");
        }
//
        /*重定向不会经过视图解析器*/
        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
       return jsonResultVO;
    }
}
