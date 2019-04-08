package com.qianfeng.jdk;

/**
 * 需要被代理的类
 */
public class PhoneFactory implements License{

    @Override
    public String salePhone() {
        System.out.println("生产手机~~~");
        return "手机";
    }
}
