package com.ruined.store.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruined.store.entity.User;
import com.ruined.store.mapper.UserMapper;
import com.ruined.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BoomJs
 * @date 2021/7/19 20:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     *
     * @param username
     * @param password
     * @return 注册是否完成
     *
     */
    @Override
    public String registered(String username, String password) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        User user = userMapper.selectOne(wrapper);      //寻找用户名重复的数据
        if(user==null){
            userMapper.registered(username,password);
            return "注册成功";
        }else
        return "用户名已存在";
    }

    @Override
    public String login(String username, String password) {

        return null;
    }
}
