package com.qianfeng.user.service;

import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.vo.UserVO;

public interface IUserService {
    TbUser login(UserVO userVO);
    TbUser queryTbUserByPhoneNum(String username);
    void addUser(TbUser tbUser);
}
