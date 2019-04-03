package com.qianfeng.dynamic;

/**
 * 手机工厂
 */
public class PhoneFactory implements ISaleAllLicense {
    @Override
    public String saleAll() {
        System.out.println("生产手机");
        return "手机";
    }
}
