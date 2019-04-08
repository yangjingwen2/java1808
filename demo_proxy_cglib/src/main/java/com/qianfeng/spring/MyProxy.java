package com.qianfeng.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 定义个代理
 */
@Component
@Aspect
public class MyProxy {

    @Before("execution(public void com.qianfeng.spring.Student.study())")
    public void beforeStudy(){
        System.out.println("先吃饭~~~");
    }
}
