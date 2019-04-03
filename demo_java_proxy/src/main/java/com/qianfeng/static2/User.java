package com.qianfeng.static2;

/**
 * 用户
 */
public class User {

    public static void main(String[] args) {
        PhoneProxy phoneProxy = new PhoneProxy();
        String phone = phoneProxy.salePhone();
        System.out.println("用户买到" + phone);
        String computer = phoneProxy.saleComputer();
        System.out.println("用户买到" + computer);
    }
}
