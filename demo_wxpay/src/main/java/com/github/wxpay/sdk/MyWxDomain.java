package com.github.wxpay.sdk;

public class MyWxDomain implements IWXPayDomain {
    @Override
    public void report(String domain, long elapsedTimeMillis, Exception ex) {

    }

    @Override
    public DomainInfo getDomain(WXPayConfig config) {
        return new DomainInfo("api.mch.weixin.qq.com",true);
    }
}
