package com.qianfeng.user.po;

import java.util.List;

public class ParentNode {

    private Long pId;
    private String pName;
    private List<ChildNode> childNodeList;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<ChildNode> getChildNodeList() {
        return childNodeList;
    }

    public void setChildNodeList(List<ChildNode> childNodeList) {
        this.childNodeList = childNodeList;
    }
}
