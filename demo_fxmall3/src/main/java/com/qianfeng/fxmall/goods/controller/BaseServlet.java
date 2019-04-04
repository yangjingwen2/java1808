package com.qianfeng.fxmall.goods.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServlet;

public class BaseServlet extends HttpServlet {

    protected static ClassPathXmlApplicationContext applicationContext;

    static {
        System.out.println(">>>>>>>初始化Spring容器>>>>>>>>>>>");
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }




}
