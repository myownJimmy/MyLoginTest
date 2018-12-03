package com.yuqikeji.login.controller;
import java.math.BigDecimal;
import java.util.HashMap;import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.yuqikeji.login.entity.User;
import com.yuqikeji.login.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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



@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    /**
    * 用户登录
     * @param req
     * @param mv
     * @return<br>
     */
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest req, ModelAndView mv) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", req.getParameter("username"));
        map.put("password", req.getParameter("password"));
        User user = userService.login(map);
        if (user != null) {
            //登录成功进入首页<br>
            mv.setViewName("index");
        } else {//登录失败回到登录页面
            mv.addObject("message", "用户名或密码输入错误,请重新输入");
            mv.setViewName("login");

        }
        return mv;
    }
}


