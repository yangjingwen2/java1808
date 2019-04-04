package com.qianfeng.fxmall.goods.service;

import com.qianfeng.fxmall.goods.bean.WxbGood;

import java.util.List;

public interface IGoodsService {

    List<WxbGood> queryGoodsByPage(Integer page) throws Exception;
}
