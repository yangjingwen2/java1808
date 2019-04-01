package com.qianfeng.leader;

public class Test {

    public static void main(String[] args) {
//        MababaLeader leader = new MababaLeader();
        //秘书给领导倒水
//        MababaLeader leader = Secretary.inject(MababaLeader.class);
//        //获取领导正在喝的水的名称
//        String name = leader.getWater().getName();
//        System.out.println(name);

//        MababaLeader mababaLeader = Secretary.inject(MababaLeader.class);
        System.out.println(Secretary.inject(Dog.class).getWater());
    }
}
