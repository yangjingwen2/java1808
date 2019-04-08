package com.qianfeng;

import org.springframework.stereotype.Component;

@Component
public class LittleClassroom extends Classroom {

    @Override
    public void show() {
        System.out.println("小学教室");
    }
}
