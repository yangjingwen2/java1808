package com.qianfeng.user.info;

import com.qianfeng.user.po.ParentNode;

import java.util.List;

public class UserPermissionInfo {

    private long userId;
    private String username;
    private String password;
    private String passwordSalt;
    private String roleName;
    @Deprecated
    private List<String> permissionList;

    private List<ParentNode> parentNodeList;

    public List<ParentNode> getParentNodeList() {
        return parentNodeList;
    }

    public void setParentNodeList(List<ParentNode> parentNodeList) {
        this.parentNodeList = parentNodeList;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Deprecated
    public List<String> getPermissionList() {
        return permissionList;
    }

    @Deprecated
    public void setPermissionList(List<String> permissionList) {
        this.permissionList = permissionList;
    }
}
