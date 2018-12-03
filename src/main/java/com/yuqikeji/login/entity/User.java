package com.yuqikeji.login.entity;

import java.math.BigDecimal;

/**
 * Description：User实体类<br/>
 * Copyright (c) ， 2018， Jimmy <br/>
 * This program is protected by copyright laws. <br/>
 * Date：2018年12月03日}
 *
 * @author yuanli
 * @version : 1.0
 */
public class User {
//  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
//  `username` VARCHAR(20) DEFAULT NULL COMMENT '用户昵称',
//  `email` VARCHAR(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
//  `password` VARCHAR(32) DEFAULT NULL COMMENT '密码',
//  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
//  `last_login_time` DATETIME DEFAULT NULL COMMENT '最后登录时间',
//  `status` BIGINT(1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
//  `account` DECIMAL(15,2) DEFAULT NULL COMMENT '账户',
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String password;
    private String email;
    private String createTime;
    private String lastLoginTime;
    private int status;
    private BigDecimal account;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", status=" + status +
                ", account=" + account +
                '}';
    }
}
