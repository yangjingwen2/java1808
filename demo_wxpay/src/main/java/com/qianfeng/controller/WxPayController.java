package com.qianfeng.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.qianfeng.service.WxPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
public class WxPayController {

    @Autowired
    private WxPayService wxPayService;

    @RequestMapping("/orderwx")
    public void createQRCode(HttpServletResponse response){
        //二维码需要包含的文本内容
        String url = wxPayService.orderWx();
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


}
