package com.qianfeng;

import com.qianfeng.ioc.Leader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Leader bean = applicationContext.getBean(Leader.class);
        bean.drink();
    }
}
