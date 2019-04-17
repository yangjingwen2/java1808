package com.qianfeng.service;

import com.github.wxpay.sdk.MyWxPayConfig;
import com.github.wxpay.sdk.WXPay;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WxPayService {

    public String orderWx() {
        MyWxPayConfig payConfig = new MyWxPayConfig();
        try {
            WXPay wxPay = new WXPay(payConfig);
            //下单
            Map<String, String> data = new HashMap<String, String>();
            //商品名称
            data.put("body", "千锋Java培训"); //商品标题
            //订单号：不能重复
            data.put("out_trade_no", "2019041716305900000017");
            //web项目
            data.put("device_info", "WEB");
            //人民币
            data.put("fee_type", "CNY");
            //金额
            data.put("total_fee", "1");//单位是分
            //用户IP
            data.put("spbill_create_ip", "123.12.12.123");//终端IP地址
            //重点：回调地址，用来通知支付结果的地址
            data.put("notify_url", "http://eiiwwd.natappfree.cc/spring/pay/pay_notify_url");
            data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
            data.put("product_id", "16");
            //返回值：下单成功之后的支付地址
            //下单，下单完成之后，会返回一个支付短链接
            Map<String, String> order = wxPay.unifiedOrder(data);
            System.out.println(order.get("code_url"));

            //返回支付短链接
            return order.get("code_url");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
