package com.qianfeng.phone.service;

import com.qianfeng.phone.po.TbPhone;
import com.qianfeng.phone.vo.BrandVO;

import java.util.List;

public interface IBrandService {
    List<BrandVO> queryBrand();
    List<TbPhone> queryPhone(String key);
    List<TbPhone> queryBrandPhone(String key,int brandId);
    List<TbPhone> queryPhoneByPhoneName(String key,String seek,String seek1);
}
