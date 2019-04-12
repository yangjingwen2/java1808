package com.qianfeng.upload;

import java.security.MessageDigest;

public class MD5Utils {

    /**
     * MD5加密
     * MD5加密
     * @return
     */
    public static String md5(byte[] bytes){
        MessageDigest md5 = null;

        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

        byte[] md5Bytes = md5.digest(bytes);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        System.out.println(hexValue.toString());

        return hexValue.toString();
    }
}
