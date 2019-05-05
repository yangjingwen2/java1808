package com.qianfeng.user.vo;

public class UserVO {
    private Long userId;
    private String username;
    private String password;
    private Long userFreez;
    private Long userMoney;

    public Long getUserFreez() {
        return userFreez;
    }

    public void setUserFreez(Long userFreez) {
        this.userFreez = userFreez;
    }

    public Long getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Long userMoney) {
        this.userMoney = userMoney;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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
}
