package com.qianfeng.service;

import com.github.wxpay.sdk.MyWxPayConfig;
import com.github.wxpay.sdk.WXPay;
import com.qianfeng.mapper.OrderMapper;
import com.qianfeng.mapper.WalletMapper;
import com.qianfeng.po.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WxPayService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private WalletMapper walletMapper;

    public String orderWx(String orderNo,String baseURL) {
        MyWxPayConfig payConfig = new MyWxPayConfig();
        try {
            WXPay wxPay = new WXPay(payConfig);
            //下单
            Map<String, String> data = new HashMap<String, String>();
            //商品名称
            data.put("body", "千锋Java培训"); //商品标题
            //订单号：不能重复
            data.put("out_trade_no", orderNo);
            //web项目
            data.put("device_info", "WEB");
            //人民币
            data.put("fee_type", "CNY");
            //金额
            data.put("total_fee", "1");//单位是分
            //用户IP
            data.put("spbill_create_ip", "123.12.12.123");//终端IP地址
            //重点：回调地址，用来通知支付结果的地址
            data.put("notify_url", baseURL+"/pay/notify");
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


    /**
     * 下单
     * @return
     */
    public String order(TbOrder order,String baseURL){
        //系统内部下单
        orderMapper.save(order);

        //查询余额
        int balance = walletMapper.queryBalance();
        //计算微信应该付多少钱？
        long i = order.getOrderGoodsPrice() - balance;
        //判断是采用余额付款，还是需要支付宝付款
        if (i>0) {
            //先冻结余额
            walletMapper.frozenMoney(balance);
            //差价需要微信付款,所以在微信上下单
            String url = orderWx(order.getOrderNo(), baseURL);
            return url;

        } else {
            //余额直接付款
        }

        return null;

    }
}
