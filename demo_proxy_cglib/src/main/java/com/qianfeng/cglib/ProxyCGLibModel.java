package com.qianfeng.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理模板
 */
public class ProxyCGLibModel implements MethodInterceptor {

    /**
     * intercept：中文意思：拦截
     * @param o 被代理的对象
     * @param method 被代理的对象的方法
     * @param args 方法的参数
     * @param methodProxy 字节码重组之后的代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("------------");
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println(">>>>>>>>>>>>");
        return result;
    }
}
