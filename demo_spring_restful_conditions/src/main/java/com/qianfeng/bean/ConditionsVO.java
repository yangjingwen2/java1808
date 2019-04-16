package com.qianfeng.bean;

public class ConditionsVO {

    private String name;
    private String url;

    public ConditionsVO() {
    }

    public ConditionsVO(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
