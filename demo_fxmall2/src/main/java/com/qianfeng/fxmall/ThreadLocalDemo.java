package com.qianfeng.fxmall;

import com.qianfeng.fxmall.goods.bean.WxbGood;

public class ThreadLocalDemo {

    private static ThreadLocal<WxbGood> threadLocal=new ThreadLocal<>();

    public static void main(String[] args) {
        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                WxbGood wxbGood = new WxbGood();
                wxbGood.setGoodName("千锋Java");
                threadLocal.set(wxbGood);
                System.out.println("线程1："+threadLocal.get().getGoodName());
            }
        }).start();

        //线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                WxbGood wxbGood = threadLocal.get();
                if (wxbGood == null) {
                    wxbGood = new WxbGood();
                    threadLocal.set(wxbGood);
                }
                System.out.println("线程2："+wxbGood.getGoodName());
            }
        }).start();
    }
}
