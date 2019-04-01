package com.qianfeng.leader;

import com.qianfeng.leader.annotation.Need;

/**
 * 领导
 */
public class MababaLeader {

    /**
     * 龙井茶
     * 茉莉花茶
     * 大红袍茶
     * 普尔
     * 咖啡
     */
    private IWater water;

    public IWater getWater() {
        return water;
    }

//    @Need(value = Coffee.class)
    public void setWater(IWater water) {
        this.water = water;
    }
}
