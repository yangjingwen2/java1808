package com.qianfeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Classroom {

//    void show();

    @Autowired
    private Desk desk;

    public void show(){
        String color = desk.getColor();
        System.out.println("教室中桌子的颜色为：" + color);
    }
}
