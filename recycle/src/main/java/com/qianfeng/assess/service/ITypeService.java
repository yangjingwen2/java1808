package com.qianfeng.assess.service;

import com.qianfeng.assess.vo.PtypeVO;

import java.util.List;

public interface ITypeService {
    List<PtypeVO> queryPtype(int types,int phoneId);
}
