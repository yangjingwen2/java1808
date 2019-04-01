package com.qianfeng;

public class MaLeader {

    private GreenTeaWater water;

    public GreenTeaWater getWater() {
        return water;
    }

    //XML的SpringIoC的配置一定要有setXXX方法
    public void setWater1(GreenTeaWater water) {
        this.water = water;
    }
}
