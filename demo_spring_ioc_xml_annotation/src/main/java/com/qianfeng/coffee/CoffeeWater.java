package com.qianfeng.coffee;

import com.qianfeng.ioc.IWater;
import org.springframework.stereotype.Component;

@Component
public class CoffeeWater implements IWater {
    @Override
    public String getName() {
        return "咖啡";
    }
}
