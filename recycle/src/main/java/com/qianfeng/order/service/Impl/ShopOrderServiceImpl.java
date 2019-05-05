package com.qianfeng.order.service.Impl;

import com.qianfeng.order.mapper.ShopOrderMapper;
import com.qianfeng.order.service.IShopOrderService;
import com.qianfeng.order.vo.ShopOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopOrderServiceImpl implements IShopOrderService {
    @Autowired
    private ShopOrderMapper shopOrderMapper;
    @Override
    public List<ShopOrderVO> queryShopOrder(int userId) {
        List<ShopOrderVO> shopOrderVOS = shopOrderMapper.queryShopOrder(userId);
        return shopOrderVOS;
    }
}
