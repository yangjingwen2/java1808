package com.qianfeng.user.realm;

import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.service.UserService;
import com.qianfeng.user.vo.LoginInfoVO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * shiro利用realm进行用户登录的数据查询和逻辑判断、并且进行权限和角色数据查询
 *
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 查询权限和角色信息
     * @param principals 获取登录成功的用户的用户名。doGetAuthenticationInfo方法值中封装的用户名
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = principals.getPrimaryPrincipal().toString();
        //查询用户的权限信息
        List<String> permissions = userService.queryPermissions(username);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    /**
     * 查询用户名和密码、并且判断用户名和密码是否正确
     * @param token 封装了用户名和密码
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //AuthenticationToken是UsernamePasswordToken的父类
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        //从token中获取用户名和密码
        String username = usernamePasswordToken.getUsername();
        char[] passwordChar = usernamePasswordToken.getPassword();
        String password = new String(passwordChar);
        //封装到LoginInfoVO
        LoginInfoVO loginInfoVO = new LoginInfoVO();
        loginInfoVO.setPassword(password);
        loginInfoVO.setUsername(username);


        TbUser login = userService.login(loginInfoVO);

        //返回值，告诉shiro我们登录成功。
        //参数1和参数2：用户和密码
        //参数3：realm的唯一标识
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password, "MyRealm");
        return info;
    }
}
