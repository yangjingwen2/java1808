package com.qianfeng.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Leader {

    @Qualifier("coffee")
    @Autowired
    private IWater water;

    @Autowired
    private Random random;

    public void drink(){
        System.out.println("leader" + random);
        System.out.println(random.nextInt()+"领导喝" + water.getName());
    }
}
