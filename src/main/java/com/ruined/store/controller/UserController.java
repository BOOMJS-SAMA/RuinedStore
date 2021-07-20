package com.ruined.store.controller;

import com.ruined.store.entity.User;
import com.ruined.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController {
    @Autowired
    UserService userService;
//    @ResponseBody
//    @RequestMapping("/")
//    public String test(){
//        System.out.println("<h1>success</h1>");
//        return "success";
//    }

    /**
     * 注册模块
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/register" )
    public String registered(String username, String password){
        return userService.registered(username,password);
    }
    @ResponseBody
    @RequestMapping(value = "/loginIn" ,method = RequestMethod.POST)
    public String loginIn(User user, HttpServletResponse response){

        Cookie cookie = new Cookie("username", user.getUsername());
        response.addCookie(cookie);
        return userService.login(user.getUsername(),user.getPassword());
    }
//    @ResponseBody
//    @RequestMapping(value = "/cookie")
//    public String getCookie(HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//        Cookie cookie = cookies[0];
//        return  cookie.getName()+":"+cookie.getValue();
//    }
    @ResponseBody
    @RequestMapping(value = "/signOut")
    public String signOut(HttpServletResponse response){
        Cookie cookie = new Cookie("username", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "success";
    }
}
