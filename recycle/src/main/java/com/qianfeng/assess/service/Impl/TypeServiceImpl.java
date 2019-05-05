package com.qianfeng.assess.service.Impl;

import com.qianfeng.assess.mapper.TypeMapper;
import com.qianfeng.assess.service.ITypeService;
import com.qianfeng.assess.vo.PtypeVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements ITypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<PtypeVO> queryPtype(int types,int phoneId) {
        Logger logger = Logger.getLogger(TypeServiceImpl.class);
        logger.info("service返回："+typeMapper.queryPtype(types,phoneId));
        return typeMapper.queryPtype(types,phoneId);
    }
}
