package com.qianfeng.user.service;

import com.qianfeng.user.exception.PasswordErrorException;
import com.qianfeng.user.exception.UsernameNotFoundException;
import com.qianfeng.user.mapper.UserMapper;
import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.utils.MD5Utils;
import com.qianfeng.user.vo.LoginInfoVO;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.CredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<String> queryPermissions(String username){
        List<String> permission = userMapper.queryPermissionByUsername(username);
        return permission;
    }

    /**
     * 登录
     * @param loginInfoVO
     */
    public TbUser login(LoginInfoVO loginInfoVO) throws AuthenticationException {
        if (loginInfoVO == null) {
            throw new NullPointerException("param is null");
        }
        String username = loginInfoVO.getUsername();
        String password = loginInfoVO.getPassword();
        if (null == username || "".equals(username)) {
            throw new NullPointerException("username is null");
        }

        //1、检验用户名在数据库是否存在
        TbUser tbUser = userMapper.checkUsername(username);
        if (tbUser == null) {
            throw new UnknownAccountException();
        }

        //2、密码校验
        //a、先对用户传入的密码进行加密
        String passwordSalt = tbUser.getPasswordSalt();
        String md5Password = MD5Utils.md5(password, passwordSalt);
        //b、同数据库的密文进行对比
        if (!md5Password.equals(tbUser.getPassword())){
            throw new IncorrectCredentialsException();
        }


        return tbUser;

    }
}
