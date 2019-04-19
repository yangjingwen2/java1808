package com.qianfeng.user.mapper;

import com.qianfeng.user.info.UserPermissionInfo;
import com.qianfeng.user.po.ParentNode;
import com.qianfeng.user.po.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    UserPermissionInfo checkUsername2(@Param("username") String username);

    List<ParentNode> queryFuncTree();
}
