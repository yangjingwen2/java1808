package com.qianfeng.dynamic;

import com.qianfeng.static2.PhoneProxy;

import java.lang.reflect.Proxy;

public class User {

    public static void main(String[] args) {
        ClassLoader classLoader = User.class.getClassLoader();
        //获取工厂所有的接口（所有的营业执照）
        Class<?>[] interfaces = ComputerFactory.class.getInterfaces();

        ISaleAllLicense computerFactory = new ComputerFactory();
        ISaleAllLicense phoneFactory = new PhoneFactory();
        //代理的摸具
        AllProxy allProxy = new AllProxy(phoneFactory);

        //参数1：类加载器的对象 ClassLoader
        //参数2：营业执照（从工厂的对象上获取营业执照）
        //参数3：需要被代理的工厂对象
        ISaleAllLicense proxyInstance = (ISaleAllLicense) Proxy.newProxyInstance(classLoader, interfaces, allProxy);
        String product = proxyInstance.saleAll();
//        String product = computerFactory.saleAll();
        System.out.println("用户买"+product);
    }
}
