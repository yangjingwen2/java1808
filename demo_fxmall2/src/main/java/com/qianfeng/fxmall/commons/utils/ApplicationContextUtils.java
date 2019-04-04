package com.qianfeng.fxmall.commons.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ApplicationContextUtils {

    private static WebApplicationContext applicationContext;

    public static WebApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(WebApplicationContext applicationContext) {
        ApplicationContextUtils.applicationContext = applicationContext;
    }
}
