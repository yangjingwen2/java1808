package com.qianfeng.fxmall.goods.service.impl;

import com.qianfeng.fxmall.commons.info.SystemConstantsUtils;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.IGoodsDAO;
import com.qianfeng.fxmall.goods.dao.impl.GoodsDAOImpl;
import com.qianfeng.fxmall.goods.mapper.GoodsMapper;
import com.qianfeng.fxmall.goods.service.IGoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service == @Component
public class GoodsServiceImpl implements IGoodsService {

    private IGoodsDAO goodsDAO = new GoodsDAOImpl();

    private Logger logger = Logger.getLogger(GoodsServiceImpl.class);

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) throws Exception {
        //入参必须记录：因为一个方法出现BUG，很有可能是传入的参数问题
        logger.debug("queryGoodsByPage:page=" + page);
        if (page < 1) {
            logger.warn("page < 1");
            throw new IndexOutOfBoundsException("页码不能小于1");
        }

        //计算起始下标
        int index = (page-1)* SystemConstantsUtils.Page.PAGE_SIZE;

        List<WxbGood> goods = goodsDAO.queryGoodsByPage(index);

        if (goods != null && !goods.isEmpty()){
            StringBuilder builder = new StringBuilder();
            for (WxbGood good:goods) {
                builder.append(good.getGoodName()+",");
            }
            logger.debug("queryGoodsByPage ,return :" + builder.toString());
        }

        return goods;
    }

}
