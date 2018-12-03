package com.yuqikeji.login.service;

import com.yuqikeji.login.entity.User;

import java.util.Map;

/**
 * Description：***<br/>
 * Copyright (c) ， 2018， Jimmy <br/>
 * This program is protected by copyright laws. <br/>
 * Date：2018年12月03日}
 *
 * @author yuanli
 * @version : 1.0
 */
public interface IUserService {
    /**
     * 登录
     * @param map
     * @return
     */
    public User login(Map<String,String> map);
}
