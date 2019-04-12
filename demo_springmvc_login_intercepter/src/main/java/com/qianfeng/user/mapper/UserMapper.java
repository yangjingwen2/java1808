package com.qianfeng.user.mapper;

import com.qianfeng.user.po.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    TbUser checkUsername(@Param("username") String username);
}
