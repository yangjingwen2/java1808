package com.qianfeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 马领导
 */
//只有加了@Component注解的类，秘书（SpringIoC）才会服务（管理）
@Component
public class MaLeader {

    private IWater water;

    //Autowired自动注入
    //类似@Need(value=XXX.class)
    @Autowired
    public void setWater(IWater water) {
        this.water = water;
    }

    public IWater getWater() {
        return water;
    }
}
