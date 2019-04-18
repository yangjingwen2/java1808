package com.qianfeng.po;


public class TbOrder {

  private long orderId;
  private String orderGoodsName;
  private long orderGoodsPrice;
  private long orderGoodsNum;
  private String orderNo;
  private String orderStatus;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderGoodsName() {
    return orderGoodsName;
  }

  public void setOrderGoodsName(String orderGoodsName) {
    this.orderGoodsName = orderGoodsName;
  }


  public long getOrderGoodsPrice() {
    return orderGoodsPrice;
  }

  public void setOrderGoodsPrice(long orderGoodsPrice) {
    this.orderGoodsPrice = orderGoodsPrice;
  }


  public long getOrderGoodsNum() {
    return orderGoodsNum;
  }

  public void setOrderGoodsNum(long orderGoodsNum) {
    this.orderGoodsNum = orderGoodsNum;
  }


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

}
