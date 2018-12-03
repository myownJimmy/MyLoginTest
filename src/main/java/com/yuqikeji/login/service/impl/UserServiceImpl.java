package com.yuqikeji.login.service.impl;

import com.yuqikeji.login.dao.IUserDao;
import com.yuqikeji.login.entity.User;
import com.yuqikeji.login.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
@Service("IUserService")
public class UserServiceImpl implements IUserService {
    /**
     * 实现UserService接口
     * @param map
     * @return
     */
    @Resource
    private IUserDao userDao;

    @Override
    public User login(Map<String, String> map) {
        return userDao.login(map);
    }
}
