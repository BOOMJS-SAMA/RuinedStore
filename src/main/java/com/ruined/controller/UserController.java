package com.ruined.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        System.out.println("success!");
        return "success!";
    }
}
