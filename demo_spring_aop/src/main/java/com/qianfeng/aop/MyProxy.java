package com.qianfeng.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //定义切面
public class MyProxy {

    //切面1
    //在执行salePhone方法之前，先执行beforeService方法
    @Before("execution(public * com.qianfeng.aop.PhoneFactory.*(..))")
    public void beforeService(){
        System.out.println("售前服务");
    }

    //切面2
    @After("execution(public * com.qianfeng.aop.PhoneFactory.*(..))")
    public void afterService(){
        System.out.println("售后服务");
    }
}
