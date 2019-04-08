package com.qianfeng;

import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@Component
public class MiddleClassroom extends Classroom {

    @Override
    public void show() {
        System.out.println("中学教室");
    }
}
