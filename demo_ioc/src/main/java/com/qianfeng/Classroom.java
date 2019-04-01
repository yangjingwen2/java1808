package com.qianfeng;

import com.qianfeng.reflect.IWantU;

/**
 * 教室
 */
public class Classroom {

    /**
     * 课桌，是教室的一个依赖
     *
     * 依赖注入：给desk赋值（只不过赋值的方式有点特别）
     */
    private Desk desk ;

    private String color="红色";

    @IWantU
    public void aaa(String color) {
        System.out.println("---------------" + color);
        this.color = color;
    }

    @IWantU
    public void bbb(String param){
        System.out.println(">>>>>>>" + param);
    }
}
