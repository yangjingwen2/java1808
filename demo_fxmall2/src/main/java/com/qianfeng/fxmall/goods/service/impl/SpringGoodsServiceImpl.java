package com.qianfeng.fxmall.goods.service.impl;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.mapper.GoodsMapper;
import com.qianfeng.fxmall.goods.service.ISpringGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringGoodsServiceImpl implements ISpringGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public WxbGood queryGoodsById(String id) {
        WxbGood goods = goodsMapper.queryGoodsById(id);
        return goods;
    }
}
