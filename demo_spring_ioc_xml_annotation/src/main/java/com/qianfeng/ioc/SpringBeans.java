package com.qianfeng.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class SpringBeans {


    /**
     * 第三方类一种交给spring管理的方式
     * 好处：
     * 1、统一了对象的管理
     * 2、spring管理的对象默认是单利的，减少对象的频繁创建和回收，从而降低了内存开销，提升了程序的运行效率
     * @return
     */
    @Bean//作用在方法上，表示此方法提供的bean可以进行注入到需要的位置
    public Random provideRandom(){
        return new Random(10);
    }
}
