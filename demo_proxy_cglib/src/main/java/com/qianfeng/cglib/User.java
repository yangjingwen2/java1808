package com.qianfeng.cglib;

import net.sf.cglib.proxy.Enhancer;

public class User {

    public static void main(String[] args) {
        //字节码重组机器
        Enhancer enhancer = new Enhancer();
        //设置字节码重组的模板
        enhancer.setCallback(new ProxyCGLibModel());
        //原材料
        enhancer.setSuperclass(PhoneFactory.class);
        //启动字节码重组，产生一个代理对象
        PhoneFactory phoneFactory = (PhoneFactory) enhancer.create();
        phoneFactory.salePhone();

        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.salePhone();

    }
}
