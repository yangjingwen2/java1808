package com.qianfeng.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.qianfeng.po.TbOrder;
import com.qianfeng.service.WxPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

@Controller
public class WxPayController {

    @Autowired
    private WxPayService wxPayService;

    /**
     * 下单
     * @param response
     */
    @RequestMapping("/orderwx")
    public void createQRCode(HttpServletResponse response,String baseURL){
        //二维码需要包含的文本内容
        Random random = new Random();

        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderGoodsName("千锋Java培训");
        tbOrder.setOrderGoodsPrice(10000);
        tbOrder.setOrderNo("20190418010150" +random.nextInt(10000));
        String url = wxPayService.order(tbOrder,baseURL);
//        String uri = "http://www.baidu.com";
        HashMap<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        //边距
        hints.put(EncodeHintType.MARGIN, 2);
        try {
            //200标识二维码图片的大小
            BitMatrix bitMatrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, 200, 200, hints);
            //将生成的图片写入网络输出流
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", response.getOutputStream());
            System.out.println("创建二维码完成");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("/notify")
    public void receiveWxPlatformMessage(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        byte[] buffer = new  byte[1024];
        int i=0;
        while ((i=inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer,0,i));
        }

        //返回参数：告知微信我收到消息了
        response.getWriter().println("<xml>\n" +
                "\n" +
                "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                "</xml>");

    }

}
