package com.qianfeng.order.service;

import com.qianfeng.order.vo.ShopOrderVO;

import java.util.List;

public interface IShopOrderService {
    List<ShopOrderVO> queryShopOrder(int userId);
}
