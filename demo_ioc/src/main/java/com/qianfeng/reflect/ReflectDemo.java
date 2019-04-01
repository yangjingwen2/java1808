package com.qianfeng.reflect;

import com.qianfeng.Classroom;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) {
        //类加载（加载到内存）
        Class<Classroom> aClass = Classroom.class;
        //获取所有属性
        Field[] fields = aClass.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field.getName());
        }

        //反射创建一个对象
        try {
            Classroom instance = aClass.newInstance();
//            instance.setColor("ss");
            //获取公有方法
            Method[] methods = aClass.getMethods();
            for (Method method:methods) {
                System.out.println("方法名称："+method.getName());
                //获取方法上是否有@IWantU注解
                IWantU annotation = method.getAnnotation(IWantU.class);
                //annotation != null表示此方法上有IWantU注解
                if (annotation != null) {
                    method.invoke(instance,"千锋Java");
                }
//                //执行方法
//                if ("setColor".equals(method.getName())) {
//                    //参数1：对象，执行此方法的对象
//                    //参数2：方法的参数
//                    method.invoke(instance,"蓝色");
//                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
