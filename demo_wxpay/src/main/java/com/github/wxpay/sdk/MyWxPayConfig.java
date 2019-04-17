package com.github.wxpay.sdk;

import com.github.wxpay.sdk.WXPayConfig;

import java.io.InputStream;

public class MyWxPayConfig extends WXPayConfig {

    /**
     * 千锋商城
     * 应用ID
     * @return
     */
    @Override
    String getAppID() {
        return "wx632c8f211f8122c6";
    }

    /**
     * 商户ID
     * @return
     */
    @Override
    String getMchID() {
        return "1497984412";
    }

    /**
     * 加密的密钥
     * @return
     */
    @Override
    String getKey() {
        return "sbNCm1JnevqI36LrEaxFwcaT0hkGxFnC";
    }

    @Override
    InputStream getCertStream() {
        return null;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        return new MyWxDomain();
    }
}
