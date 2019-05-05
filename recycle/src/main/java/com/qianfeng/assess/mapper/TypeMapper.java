package com.qianfeng.assess.mapper;

import com.qianfeng.assess.vo.CtypeVO;
import com.qianfeng.assess.vo.PtypeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TypeMapper {
    List<PtypeVO> queryPtype(@Param("types") int types,@Param("phoneId") int phoneId);

    List<CtypeVO> queryCtype(@Param("types") int types);
}
