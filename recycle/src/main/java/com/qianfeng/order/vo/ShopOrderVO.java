package com.qianfeng.order.vo;

import java.util.List;

public class ShopOrderVO {
    private Long shopId;
    private String shopPic;
    private String shopPhoneName;
    private Long shopWreckPrice;
    private Long shoppingId;
    private String shoppingType;
    private List<String> shoppingTypeList;

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

    public Long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Long shoppingId) {
        this.shoppingId = shoppingId;
    }

    public String getShoppingType() {
        return shoppingType;
    }

    public void setShoppingType(String shoppingType) {
        this.shoppingType = shoppingType;
    }

    public List<String> getShoppingTypeList() {
        return shoppingTypeList;
    }

    public void setShoppingTypeList(List<String> shoppingTypeList) {
        this.shoppingTypeList = shoppingTypeList;
    }

    @Override
    public String toString() {
        return "ShopOrderVO{" +
                "shopId=" + shopId +
                ", shopPic='" + shopPic + '\'' +
                ", shopPhoneName='" + shopPhoneName + '\'' +
                ", shopWreckPrice=" + shopWreckPrice +
                ", shoppingId=" + shoppingId +
                ", shoppingType='" + shoppingType + '\'' +
                ", shoppingTypeList='" + shoppingTypeList + '\'' +
                '}';
    }
}
