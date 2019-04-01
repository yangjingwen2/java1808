package com.qianfeng;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 绿茶
 */
//Component注解定义当前类能用来创建对象
@Component
public class GreenTeaWater implements IWater {

    @Override
    public String getName() {
        return "绿茶";
    }
}
