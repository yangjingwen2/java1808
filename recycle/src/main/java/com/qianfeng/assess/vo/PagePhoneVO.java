package com.qianfeng.assess.vo;

public class PagePhoneVO {
    private String page;
    private String phone;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PagePhoneVO{" +
                "page='" + page + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
