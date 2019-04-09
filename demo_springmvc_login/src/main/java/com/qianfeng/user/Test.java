package com.qianfeng.user;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {

    public static void main(String[] args) {
//        try {
//            //获得MD5算法对象
//            MessageDigest md5=MessageDigest.getInstance("md5");
//            //加密原字符串的字节
//            md5.update("123456".getBytes());
//            //获得加密后的字节
//            byte[] bytes=md5.digest();
//            //将字节转化为十六进制
//            StringBuilder strb=new StringBuilder();
//            for(int i=0;i<bytes.length;i++) {
//                strb.append(Integer.toHexString(bytes[i] & 0xFF));
//            }
//
//            System.out.println(strb.toString());
//
//        } catch (NoSuchAlgorithmException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

//        try {
//            //确定计算方法
//            MessageDigest md5=MessageDigest.getInstance("MD5");
//            BASE64Encoder base64en = new BASE64Encoder();
//            //加密后的字符串
//            String newstr=base64en.encode(md5.digest("123456".getBytes()));
//            System.out.println(newstr);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }

        MessageDigest md5 = null;
        String salt="qianfeng";
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        char[] charArray = ("123456"+salt).toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        System.out.println(hexValue.toString());
    }

}
