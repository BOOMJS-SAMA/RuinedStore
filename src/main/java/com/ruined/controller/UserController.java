package com.ruined.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BoomJs
 * @data 2021/7/19 17:05
 */
@Controller
public class UserController {
    @RequestMapping("/test")
    public void test(){
        System.out.println("success!");
    }
}
