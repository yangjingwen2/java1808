package com.qianfeng.tea;

import com.qianfeng.ioc.IWater;
import org.springframework.stereotype.Component;

/**
 * 茶
 */
@Component
public class TeaWater implements IWater {

    @Override
    public String getName() {
        return "茶";
    }
}
