package com.qianfeng.fxmall.commons.listener;

import com.qianfeng.fxmall.commons.utils.ApplicationContextUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
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
        System.out.println(">>>>>>>>>>获取已经初始化好的Spring容器初>>>>>>>>>>");
        //servletContext:servlet上下文，application=servletContext
        ServletContext servletContext = sce.getServletContext();
        String parameter = servletContext.getInitParameter("java");
        System.out.println(parameter);

        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContextUtils.setApplicationContext(applicationContext);

    }

    /**
     * 容器关闭的时候触发的方法
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
