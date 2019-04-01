package com.qianfeng.leader;

import com.qianfeng.leader.annotation.Need;

public class Dog {

    private IWater water;

    /**
     * 喂水
     * @param water
     */
//    @Need(value = Coffee.class)
    public void feedWater(IWater water){
        this.water = water;
    }


    public IWater getWater() {
        return water;
    }
}
