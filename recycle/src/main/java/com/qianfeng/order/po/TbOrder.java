package com.qianfeng.order.po;


public class TbOrder {

  private long orderId;
  private long userId;
  private String orderPhone;
  private String orderNum;
  private long orderPrice;
  private long payId;
  private String linkName;
  private String mobile;
  private String province;
  private String city;
  private String district;
  private String schoolId;
  private String address;
  private String stime;
  private String etime;
  private String expressTrue;
  private String memberBank;
  private String bankname;
  private String realname;
  private String cardSn;
  private String lock;
  private String pwd;
  private String alipayRealname;
  private String alipayUsername;
  private String mianjiaoMethod2;
  private String ditieXian;
  private String ditieZhan;
  private long shopId;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getOrderPhone() {
    return orderPhone;
  }

  public void setOrderPhone(String orderPhone) {
    this.orderPhone = orderPhone;
  }


  public String getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }


  public long getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(long orderPrice) {
    this.orderPrice = orderPrice;
  }


  public long getPayId() {
    return payId;
  }

  public void setPayId(long payId) {
    this.payId = payId;
  }


  public String getLinkName() {
    return linkName;
  }

  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }


  public String getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(String schoolId) {
    this.schoolId = schoolId;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getStime() {
    return stime;
  }

  public void setStime(String stime) {
    this.stime = stime;
  }


  public String getEtime() {
    return etime;
  }

  public void setEtime(String etime) {
    this.etime = etime;
  }


  public String getExpressTrue() {
    return expressTrue;
  }

  public void setExpressTrue(String expressTrue) {
    this.expressTrue = expressTrue;
  }


  public String getMemberBank() {
    return memberBank;
  }

  public void setMemberBank(String memberBank) {
    this.memberBank = memberBank;
  }


  public String getBankname() {
    return bankname;
  }

  public void setBankname(String bankname) {
    this.bankname = bankname;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getCardSn() {
    return cardSn;
  }

  public void setCardSn(String cardSn) {
    this.cardSn = cardSn;
  }


  public String getLock() {
    return lock;
  }

  public void setLock(String lock) {
    this.lock = lock;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getAlipayRealname() {
    return alipayRealname;
  }

  public void setAlipayRealname(String alipayRealname) {
    this.alipayRealname = alipayRealname;
  }


  public String getAlipayUsername() {
    return alipayUsername;
  }

  public void setAlipayUsername(String alipayUsername) {
    this.alipayUsername = alipayUsername;
  }


  public String getMianjiaoMethod2() {
    return mianjiaoMethod2;
  }

  public void setMianjiaoMethod2(String mianjiaoMethod2) {
    this.mianjiaoMethod2 = mianjiaoMethod2;
  }


  public String getDitieXian() {
    return ditieXian;
  }

  public void setDitieXian(String ditieXian) {
    this.ditieXian = ditieXian;
  }


  public String getDitieZhan() {
    return ditieZhan;
  }

  public void setDitieZhan(String ditieZhan) {
    this.ditieZhan = ditieZhan;
  }


  public long getShopId() {
    return shopId;
  }

  public void setShopId(long shopId) {
    this.shopId = shopId;
  }

  @Override
  public String toString() {
    return "TbOrder{" +
            "orderId=" + orderId +
            ", userId=" + userId +
            ", orderPhone='" + orderPhone + '\'' +
            ", orderNum='" + orderNum + '\'' +
            ", orderPrice=" + orderPrice +
            ", payId=" + payId +
            ", linkName='" + linkName + '\'' +
            ", mobile='" + mobile + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", district='" + district + '\'' +
            ", schoolId='" + schoolId + '\'' +
            ", address='" + address + '\'' +
            ", stime='" + stime + '\'' +
            ", etime='" + etime + '\'' +
            ", expressTrue='" + expressTrue + '\'' +
            ", memberBank='" + memberBank + '\'' +
            ", bankname='" + bankname + '\'' +
            ", realname='" + realname + '\'' +
            ", cardSn='" + cardSn + '\'' +
            ", lock='" + lock + '\'' +
            ", pwd='" + pwd + '\'' +
            ", alipayRealname='" + alipayRealname + '\'' +
            ", alipayUsername='" + alipayUsername + '\'' +
            ", mianjiaoMethod2='" + mianjiaoMethod2 + '\'' +
            ", ditieXian='" + ditieXian + '\'' +
            ", ditieZhan='" + ditieZhan + '\'' +
            ", shopId=" + shopId +
            '}';
  }
}
