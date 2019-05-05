package com.qianfeng.assess.vo;

import java.util.List;

public class PtypeVO {
    private Long pId;
    private String pName;
    private List<CtypeVO> pCtypeList;

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

    public List<CtypeVO> getpCtypeList() {
        return pCtypeList;
    }

    public void setpCtypeList(List<CtypeVO> pCtypeList) {
        this.pCtypeList = pCtypeList;
    }

    @Override
    public String toString() {
        return "PtypeVO{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pCtypeList=" + pCtypeList +
                '}';
    }
}
