package com.ruined.ruinedshoppingmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserMapper userMapper;
    @RequestMapping("/")
    void a(){
        System.out.println(userMapper.getVersion());
    }
}
