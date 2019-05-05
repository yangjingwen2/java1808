package com.qianfeng.Expressage.service.Impl;

import com.qianfeng.Expressage.mapper.ExpressMapper;
import com.qianfeng.Expressage.po.TbExpress;
import com.qianfeng.Expressage.service.IExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpressServiceImpl implements IExpressService {
    @Autowired
    private ExpressMapper expressMapper;
    @Override
    public void addExpress(TbExpress express) {
        expressMapper.addExpress(express);
    }
}
