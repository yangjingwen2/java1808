package com.qianfeng.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，实现InvocationHandler接口
 */
public class AllProxy implements InvocationHandler {

    //动态代理代理的是有相同营业职找的工厂
    private ISaleAllLicense factory;

    //参数：实现了ISaleAllLicense营业执照工厂对象
    public AllProxy(ISaleAllLicense factory) {
        this.factory = factory;
    }

    private void beforeService(){
        System.out.println("售前服务");
    }

    private void afterService(){
        System.out.println("售后服务");
    }

    private void saling(){
        System.out.println("售中回访服务");
    }

    /**
     * 动态代理的核心方法
     * @param proxy 代理本身（不用）
     * @param method 被代理的工厂方法（行为）
     * @param args 被代理的方法的参数
     * @return 返回执行代理方法之后的结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //售前
        beforeService();

        saling();
        //参数1：被代理的工厂对象
        Object result = method.invoke(factory, args);
        //售后
        afterService();

        return result;
    }
}
