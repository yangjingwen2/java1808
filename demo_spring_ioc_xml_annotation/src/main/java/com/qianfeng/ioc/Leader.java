package com.qianfeng.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leader {

    @Autowired
    private IWater water;

    public void drink(){
        System.out.println("领导喝" + water.getName());
    }
}
