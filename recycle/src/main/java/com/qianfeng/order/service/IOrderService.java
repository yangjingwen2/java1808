package com.qianfeng.order.service;

import com.qianfeng.order.po.TbOrder;

public interface IOrderService {
    void addOrder(TbOrder order);
    void deleteShop(int userId);
}
