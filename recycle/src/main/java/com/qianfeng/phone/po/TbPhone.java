package com.qianfeng.phone.po;


public class TbPhone {

  private long phoneId;
  private String phoneName;
  private long phoneParent;
  private long phonePrice;
  private String phonePic;
  private String phoneMd5Pic;


  public long getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(long phoneId) {
    this.phoneId = phoneId;
  }


  public String getPhoneName() {
    return phoneName;
  }

  public void setPhoneName(String phoneName) {
    this.phoneName = phoneName;
  }


  public long getPhoneParent() {
    return phoneParent;
  }

  public void setPhoneParent(long phoneParent) {
    this.phoneParent = phoneParent;
  }


  public long getPhonePrice() {
    return phonePrice;
  }

  public void setPhonePrice(long phonePrice) {
    this.phonePrice = phonePrice;
  }


  public String getPhonePic() {
    return phonePic;
  }

  public void setPhonePic(String phonePic) {
    this.phonePic = phonePic;
  }


  public String getPhoneMd5Pic() {
    return phoneMd5Pic;
  }

  public void setPhoneMd5Pic(String phoneMd5Pic) {
    this.phoneMd5Pic = phoneMd5Pic;
  }

  @Override
  public String toString() {
    return "TbPhone{" +
            "phoneId=" + phoneId +
            ", phoneName='" + phoneName + '\'' +
            ", phoneParent=" + phoneParent +
            ", phonePrice=" + phonePrice +
            ", phonePic='" + phonePic + '\'' +
            ", phoneMd5Pic='" + phoneMd5Pic + '\'' +
            '}';
  }
}
