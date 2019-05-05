package com.qianfeng.user.mapper;

import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    TbUser login (@Param("username") String username);
    void addUser(@Param("user") TbUser user);

}
