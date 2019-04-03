package com.qianfeng.static2;

public class ComputerFactory implements ISaleComputerLicense {
    @Override
    public String saleComputer() {
        System.out.println("工厂生产电脑");
        return "电脑";
    }
}
