package com.qianfeng.static2;

public class PhoneProxy implements ISalePhoneLicense,ISaleComputerLicense {

    private void beforeSale(){
        System.out.println("售前服务");
    }

    private void saling(){
        System.out.println("售中回访服务");
    }

    private void afterSale(){
        System.out.println("售后服务");
    }


    /**
     * 卖手机
     * @return
     */
    @Override
    public String salePhone() {

        //售前
        beforeSale();

        saling();

        //从手机工厂进货
        String phone = new PhoneFactory().salePhone();

        //售后
        afterSale();

        return phone;
    }

    @Override
    public String saleComputer() {
        //售前
        beforeSale();

        saling();
        String computer = new ComputerFactory().saleComputer();
        //售后
        afterSale();
        return computer;
    }
}
