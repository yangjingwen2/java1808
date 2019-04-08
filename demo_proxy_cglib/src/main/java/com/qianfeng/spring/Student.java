package com.qianfeng.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements IStudent {

    @Override
    public void study(){
        System.out.println("学习中~~~");
    }
}
