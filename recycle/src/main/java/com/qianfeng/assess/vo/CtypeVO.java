package com.qianfeng.assess.vo;

public class CtypeVO {
    private Long cId;
    private String cName;
    private String cDesc;
    private Long cPrice;

    public Long getcPrice() {
        return cPrice;
    }

    public void setcPrice(Long cPrice) {
        this.cPrice = cPrice;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    @Override
    public String toString() {
        return "CtypeVO{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cDesc='" + cDesc + '\'' +
                '}';
    }
}
