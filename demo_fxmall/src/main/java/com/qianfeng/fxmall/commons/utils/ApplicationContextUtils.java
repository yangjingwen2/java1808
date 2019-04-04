package com.qianfeng.fxmall.commons.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtils {

    private static ClassPathXmlApplicationContext applicationContext;

    public static void init() {
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }

    public static ClassPathXmlApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
