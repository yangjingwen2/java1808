package com.qianfeng.coffee;

import com.qianfeng.ioc.IWater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Component注解中的参数：定义类的昵称（在spring）
 * 默认的名词时：类名的首字母小写后的名称
 */
@Component("coffee")
public class CoffeeWater implements IWater {

    @Autowired
    private Random random ;
    @Override
    public String getName() {
        System.out.println("water:"+random);
        return "咖啡"+random.nextInt();
    }
}
