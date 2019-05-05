package com.qianfeng.user.po;


public class TbUser {

  private long userId;
  private String userName;
  private String userPhone;
  private String userPassword;
  private String userAdd;
  private String userAdd1;
  private String userAdd2;
  private String userBank;
  private String userWx;
  private Long userFreez;
  private Long userMoney;

  public Long getUserFreez() {
    return userFreez;
  }

  public void setUserFreez(Long userFreez) {
    this.userFreez = userFreez;
  }

  public Long getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(Long userMoney) {
    this.userMoney = userMoney;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserAdd() {
    return userAdd;
  }

  public void setUserAdd(String userAdd) {
    this.userAdd = userAdd;
  }


  public String getUserAdd1() {
    return userAdd1;
  }

  public void setUserAdd1(String userAdd1) {
    this.userAdd1 = userAdd1;
  }


  public String getUserAdd2() {
    return userAdd2;
  }

  public void setUserAdd2(String userAdd2) {
    this.userAdd2 = userAdd2;
  }


  public String getUserBank() {
    return userBank;
  }

  public void setUserBank(String userBank) {
    this.userBank = userBank;
  }


  public String getUserWx() {
    return userWx;
  }

  public void setUserWx(String userWx) {
    this.userWx = userWx;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userPhone='" + userPhone + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", userAdd='" + userAdd + '\'' +
            ", userAdd1='" + userAdd1 + '\'' +
            ", userAdd2='" + userAdd2 + '\'' +
            ", userBank='" + userBank + '\'' +
            ", userWx='" + userWx + '\'' +
            ", userFreez=" + userFreez +
            ", userMoney=" + userMoney +
            '}';
  }
}
