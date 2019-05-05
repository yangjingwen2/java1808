package com.qianfeng.user.service.impl;

import com.qianfeng.commons.MD5Utils;
import com.qianfeng.user.mapper.UserMapper;
import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.service.IUserService;
import com.qianfeng.user.vo.UserVO;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public TbUser login(UserVO userVO) {
        if (userVO == null) {
            throw new NullPointerException("param is null");
        }
        String username = userVO.getUsername();
        String password = userVO.getPassword();
        if (null == username || "".equals(username)) {
            throw new NullPointerException("username is null");
        }

        //1、检验用户名在数据库是否存在
        TbUser tbUser = userMapper.login(username);
        if (tbUser == null) {
            throw new UnknownAccountException();
        }

        //2、密码校验
        //a、先对用户传入的密码进行加密

        String md5Password = MD5Utils.md5(password,username);
        //b、同数据库的密文进行对比
        if (!md5Password.equals(tbUser.getUserPassword())){
            throw new IncorrectCredentialsException();
        }


        return tbUser;
    }
    @Override
    public TbUser queryTbUserByPhoneNum(String username) {

        TbUser tbUser=userMapper.login(username);
        return tbUser;
    }

    @Override
    public void addUser(TbUser tbUser) {
        userMapper.addUser(tbUser);
    }
}
