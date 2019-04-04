package com.qianfeng.fxmall;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.impl.GoodsDAOImpl;

import java.util.List;

/**
 * 印度1.0
 */
public class Test {

    /**
     * 中国ABC
     * @param args
     */
    public static void main(String[] args) {
        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                GoodsDAOImpl goodsDAO = new GoodsDAOImpl();
                try {
                    List<WxbGood> goods = goodsDAO.queryGoodsByPage(0);
                    goods.get(0).setGoodName("千锋");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                GoodsDAOImpl goodsDAO1 = new GoodsDAOImpl();
                try {
                    List<WxbGood> goods = goodsDAO1.queryGoodsByPage(0);
                    System.out.println("线程1的二次执行：" +goods.get(0).getGoodName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //线程2
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        GoodsDAOImpl dao = new GoodsDAOImpl();
                        try {
                            List<WxbGood> wxbGoods = dao.queryGoodsByPage(0);
                            System.out.println("线程2："+wxbGoods.get(0).getGoodName());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();

            }
        }).start();
    }
}
