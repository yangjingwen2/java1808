package com.qianfeng.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理模板
 */
public class ProxyModel implements InvocationHandler {

    private PhoneFactory factory;

    public ProxyModel(PhoneFactory factory) {
        this.factory = factory;
    }

    /**
     * 抽象方法：用来生成代理的方法（行为）。
     * @param proxy 代理对象
     * @param method 被代理（工厂）对象的方法
     * @param args 被带离对象的方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("卖手机前");
        //执行工厂中的salePhone方法
        //参数1：当前method是属于哪一个对象的
        Object result = method.invoke(factory, args);
        System.out.println("卖手机后");

        return result;
    }
}
