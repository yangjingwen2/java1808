package com.qianfeng.assess.po;


public class TbShopping {

  private long id;
  private String shopPhonePic;
  private String shopWreckType;
  private long shopWreckPrice;
  private long shopPhoneId;
  private Long shopUserId;

  public Long getShopUserId() {
    return shopUserId;
  }

  public void setShopUserId(Long shopUserId) {
    this.shopUserId = shopUserId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getShopPhonePic() {
    return shopPhonePic;
  }

  public void setShopPhonePic(String shopPhonePic) {
    this.shopPhonePic = shopPhonePic;
  }


  public String getShopWreckType() {
    return shopWreckType;
  }

  public void setShopWreckType(String shopWreckType) {
    this.shopWreckType = shopWreckType;
  }


  public long getShopWreckPrice() {
    return shopWreckPrice;
  }

  public void setShopWreckPrice(long shopWreckPrice) {
    this.shopWreckPrice = shopWreckPrice;
  }


  public long getShopPhoneId() {
    return shopPhoneId;
  }

  public void setShopPhoneId(long shopPhoneId) {
    this.shopPhoneId = shopPhoneId;
  }

}
