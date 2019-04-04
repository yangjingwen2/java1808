package com.qianfeng.fxmall.commons.listener;

import com.qianfeng.fxmall.commons.utils.ApplicationContextUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ServletContextListener是用来监听tomcat容器启动的监听器
 */
public class TomcatInitListener implements ServletContextListener {

    /**
     * 容器初始化触发的方法
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(">>>>>>>>>>>项目启动>>>>>>>>>>");
        System.out.println(">>>>>>>>>>Spring容器初始化>>>>>>>>>>");
        ApplicationContextUtils.init();

    }

    /**
     * 容器关闭的时候触发的方法
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
