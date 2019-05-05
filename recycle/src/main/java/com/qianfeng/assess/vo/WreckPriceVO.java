package com.qianfeng.assess.vo;

public class WreckPriceVO {
    private String wreckPrice;

    public String getWreckPrice() {
        return wreckPrice;
    }

    public void setWreckPrice(String wreckPrice) {
        this.wreckPrice = wreckPrice;
    }

    @Override
    public String toString() {
        return "WreckPriceVO{" +
                "wreckPrice='" + wreckPrice + '\'' +
                '}';
    }
}
