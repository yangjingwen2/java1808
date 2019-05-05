package com.qianfeng.assess.vo;

import java.util.List;

public class ImputedVO {
    private List<String> imputedList;
    private String phonePrice;
    private String phoneId;
    private List<String> type;
    private String phonePic;

    public String getPhonePic() {
        return phonePic;
    }

    public void setPhonePic(String phonePic) {
        this.phonePic = phonePic;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(String phonePrice) {
        this.phonePrice = phonePrice;
    }

    public List<String> getImputedList() {
        return imputedList;
    }

    public void setImputedList(List<String> imputedList) {
        this.imputedList = imputedList;
    }

    @Override
    public String toString() {
        return "ImputedVO{" +
                "imputedList=" + imputedList +
                '}';
    }
}
