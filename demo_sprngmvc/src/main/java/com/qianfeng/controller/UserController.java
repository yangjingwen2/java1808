package com.qianfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 完成类似Servlet的功能
 *
 * @Controller表示当前类是一个可以完成用户请求和响应的类
 * Controller是Component的子集
 *
 *
 */
@Controller
public class UserController {

    /**
     * ModelAndView:给用户响应的一个对象，包括Model（数据）和要跳转的页面View
     * ModelAndView：可以完成页面跳转
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(){

        System.out.println("这是SpringMVC");

        ModelAndView modelAndView = new ModelAndView("hello.jsp");
        //设置需要传递给页面的值
        //参数1：key
        //参数2：value
        modelAndView.addObject("param","千锋Java");

        return modelAndView;
    }
}
