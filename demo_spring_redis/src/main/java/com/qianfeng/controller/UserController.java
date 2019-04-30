package com.qianfeng.controller;

import com.qianfeng.bean.LoginInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
     *
     * 默认情况：此方法既可以处理Get请求 ， 也可以处理Post请求
     *
     * 注解中的method属性表示请求的方式，取值有Get或者Post
     * @return
     */
//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    @PostMapping("/login")
    @GetMapping("/login")
    public ModelAndView login(String username,String password){

        System.out.println("这是SpringMVC");

        System.out.println(username + "/" + password);

        ModelAndView modelAndView = new ModelAndView("hello.jsp");
        //设置需要传递给页面的值
        //参数1：key
        //参数2：value
        modelAndView.addObject("param","千锋Java");
        return modelAndView;
    }

    @GetMapping("/login2")
    public ModelAndView login(LoginInfoVO loginInfoVO){

        System.out.println("这是SpringMVC");

        System.out.println(loginInfoVO.getUsername()+"/"+loginInfoVO.getPassword());


        ModelAndView modelAndView = new ModelAndView("hello.jsp");
        //设置需要传递给页面的值
        //参数1：key
        //参数2：value
        modelAndView.addObject("param","千锋Java");

        return modelAndView;
    }

    /**
     *
     * @param loginInfoVO
     * @return 返回需要跳转的页面的地址
     */
    @GetMapping("/login3")
    public String login3(LoginInfoVO loginInfoVO,Model model){
        System.out.println("-------------->" + loginInfoVO.getUsername());
        //值传递
        model.addAttribute("param3","千锋Java3");
        return "hello";
    }

    /**
     * 重定向：重定向不能进行参数传递
     * @return
     */
    @RequestMapping("/login4")
    public String login4(){
        System.out.println(">>>>重定向>>>>");
        return "redirect:hello.jsp";
    }

//    @RequestMapping("/images/abc.png")
//    public String test(){
//        System.out.println(">>>>>请求图片，反而进入了Controller");
//        return "hello.jsp";
//    }
}