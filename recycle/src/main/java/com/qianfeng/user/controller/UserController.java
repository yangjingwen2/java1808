package com.qianfeng.user.controller;

import com.qianfeng.commons.MD5Utils;
import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.service.IUserService;
import com.qianfeng.user.vo.JsonResultVO;
import com.qianfeng.user.vo.UserVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public IUserService userServiceImpl;
    @ResponseBody
    @RequestMapping("/login")
    public JsonResultVO loginAjax(UserVO userVO, HttpSession session){
        JsonResultVO jsonResultVO = new JsonResultVO();
        System.out.println(userVO.getUsername()+"-------"+userVO.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(userVO.getUsername(),userVO.getPassword()));
            jsonResultVO.setCode(1);
            TbUser user = userServiceImpl.login(userVO);
            session.setAttribute("user",user);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("登录失败，用户名或者密码错误");
        }

        /*重定向不会经过视图解析器*/
        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
        return jsonResultVO;
    }
    @ResponseBody
    @RequestMapping("/register1")
    public String register1(String userName){
        TbUser tbUser = userServiceImpl.queryTbUserByPhoneNum(userName);
        if (tbUser!=null){

            return "failed";
        }
        return "1";
    }
    @ResponseBody
    @RequestMapping("/selectMoney")
    public TbUser queryMoney(HttpSession session){
        TbUser user = (TbUser) session.getAttribute("user");
        String userPhone = user.getUserPhone();
        TbUser tbUser = userServiceImpl.queryTbUserByPhoneNum(userPhone);
        System.out.println(tbUser);
        return tbUser;
    }
    @ResponseBody
    @RequestMapping("/register")
    public String register(String userName, String userPassword, String userToken){
        TbUser tbUser = userServiceImpl.queryTbUserByPhoneNum(userName);
        if (tbUser!=null){

            return "failed";
        }

        if ("-549428371".equals("-549428371")){
            //添加
            TbUser user=new TbUser();
            user.setUserPhone(userName);
            String md5 = MD5Utils.md5(userPassword, userName);
            user.setUserPassword(md5);
            userServiceImpl.addUser(user);
        }else {

            return "repeat";
        }

        return "1";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response,HttpSession session){
       session.setAttribute("user","");
        return "redirect: ../html/login.html";
    }
}
