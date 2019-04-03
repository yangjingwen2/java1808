package com.qianfeng.aop;

import org.springframework.stereotype.Component;

@Component
public class PhoneFactory implements ISalePhoneLicense {

    @Override
    public String salePhone() {
        System.out.println("生产手机");
        return "手机";
    }

    @Override
    public void saleComputer(String num) {
        System.out.println("生产电脑，台数：" + num);
    }
}
