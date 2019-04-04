package com.qianfeng.fxmall.goods.controller;

import com.qianfeng.fxmall.commons.utils.ApplicationContextUtils;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.service.ISpringGoodsService;
import com.qianfeng.fxmall.goods.service.impl.SpringGoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet不能交给Spring管理
 */
public class GoodsDetailsServlet extends HttpServlet {

    private ISpringGoodsService goodsService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        goodsService = ApplicationContextUtils.getApplicationContext().getBean(SpringGoodsServiceImpl.class);
        WxbGood wxbGood = goodsService.queryGoodsById("14886110");
        System.out.println(wxbGood.getGoodName());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
