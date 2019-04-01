package com.qianfeng.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //表示当前注解作用于方法上
@Retention(RetentionPolicy.RUNTIME)//该注解在运行期间有效
public @interface IWantU {
}
