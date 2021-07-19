package com.ruined.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BoomJs
 * @data 2021/7/19 17:05
 */
@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        System.out.println("success!");
        return "success!";
    }
}
