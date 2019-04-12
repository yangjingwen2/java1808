package com.qianfeng.user.intercepter;

import com.qianfeng.user.info.UserPermissionInfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 权限拦截
 */
public class PermissionIntercepter implements HandlerInterceptor {

    /**
     * 在所有的COntroller方法执行之前，会先执行preHandle方法
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 拦截器的帮助类对象
     * @return true代表不拦截，false代表拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-------拦截器-----------");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"/"+password);

        //判断用户是否登录
        UserPermissionInfo user = (UserPermissionInfo) request.getSession().getAttribute("user");
        if (null == user) {
            System.out.println("--->>>>");
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/pages/login.html");
            return false;
        }

        //用户权限列表
        List<String> permissionList = user.getPermissionList();

        StringBuffer requestURL = request.getRequestURL();

        String path = requestURL.toString();
        int startIndex = path.lastIndexOf("/");

        String funcationName = path.substring(startIndex+1);


        if (!permissionList.contains(funcationName)) {
            String contextPath = request.getContextPath();
                response.sendRedirect(contextPath+"/error.jsp");
                return false;
            }

        return true;
    }
}
