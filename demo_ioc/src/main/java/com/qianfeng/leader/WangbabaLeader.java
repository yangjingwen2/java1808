package com.qianfeng.leader;

import com.qianfeng.leader.annotation.Need;

public class WangbabaLeader {

    private IWater water;

    public IWater getWater() {
        return water;
    }

    //通过注解提出需求
    @Need(value = RedTeaWater.class)
    public void setWater(IWater water) {
        this.water = water;
    }
}
