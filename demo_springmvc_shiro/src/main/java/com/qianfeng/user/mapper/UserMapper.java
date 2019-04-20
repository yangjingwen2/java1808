package com.qianfeng.user.mapper;

import com.qianfeng.user.po.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    TbUser checkUsername(@Param("username") String username);

    /**
     * 查询用户的权限信息
     * @param username
     * @return
     */
    List<String> queryPermissionByUsername(@Param("username") String username);
}
