package com.qianfeng.static2;

/**
 * 手机工厂
 */
public class PhoneFactory implements ISalePhoneLicense {

    @Override
    public String salePhone() {
        System.out.println("华为工厂生产手机");
        return "手机";
    }
}
