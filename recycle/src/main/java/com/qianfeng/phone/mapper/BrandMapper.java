package com.qianfeng.phone.mapper;

import com.qianfeng.phone.po.TbPhone;
import com.qianfeng.phone.vo.BrandVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BrandMapper {
    List<BrandVO> queryBrand();
    List<TbPhone> queryPhone();
    List<TbPhone> queryBrandPhone(@Param("brandId") int brandId);
    List<TbPhone> queryPhoneByPhoneName(@Param("seek") String seek,@Param("seek1") String seek1);
}
