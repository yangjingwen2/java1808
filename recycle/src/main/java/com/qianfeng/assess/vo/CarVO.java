package com.qianfeng.assess.vo;

public class CarVO {
    private Long shopId;
    private String shopPic;
    private String shopPhoneName;
    private Long shopWreckPrice;
    private Long shoppingId;

    public Long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Long shoppingId) {
        this.shoppingId = shoppingId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopPic() {
        return shopPic;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }

    public String getShopPhoneName() {
        return shopPhoneName;
    }

    public void setShopPhoneName(String shopPhoneName) {
        this.shopPhoneName = shopPhoneName;
    }

    public Long getShopWreckPrice() {
        return shopWreckPrice;
    }

    public void setShopWreckPrice(Long shopWreckPrice) {
        this.shopWreckPrice = shopWreckPrice;
    }

    @Override
    public String toString() {
        return "CarVO{" +
                "shopId=" + shopId +
                ", shopPic='" + shopPic + '\'' +
                ", shopPhoneName='" + shopPhoneName + '\'' +
                ", shopWreckPrice=" + shopWreckPrice +
                '}';
    }
}
