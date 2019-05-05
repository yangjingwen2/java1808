package com.qianfeng.phone.vo;

public class BrandIdVO {
    private String brandId;
    private String seek;

    public String getSeek() {
        return seek;
    }

    public void setSeek(String seek) {
        this.seek = seek;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return "BrandIdVO{" +
                "brandId='" + brandId + '\'' +
                ", seek='" + seek + '\'' +
                '}';
    }
}
