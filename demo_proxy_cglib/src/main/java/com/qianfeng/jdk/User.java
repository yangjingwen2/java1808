package com.qianfeng.jdk;

import java.lang.reflect.Proxy;

public class User {

    public static void main(String[] args) {

        Class<?>[] interfaces = PhoneFactory.class.getInterfaces();
        ProxyModel proxyModel = new ProxyModel(new PhoneFactory());
        //找代理
        License proxyInstance = (License) Proxy.newProxyInstance(User.class.getClassLoader(), interfaces, proxyModel);
        proxyInstance.salePhone();

        System.out.println(proxyInstance);
    }
}
