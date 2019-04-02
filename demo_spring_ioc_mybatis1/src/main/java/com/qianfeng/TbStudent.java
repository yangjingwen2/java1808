package com.qianfeng;


import java.io.Serializable;

public class TbStudent implements Serializable {

  private long stuId;
  private String stuName;
  private long stuAge;


  public long getStuId() {
    return stuId;
  }

  public void setStuId(long stuId) {
    this.stuId = stuId;
  }


  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }


  public long getStuAge() {
    return stuAge;
  }

  public void setStuAge(long stuAge) {
    this.stuAge = stuAge;
  }

}
