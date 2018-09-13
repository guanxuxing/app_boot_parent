package com.boot.app.controller;

import com.boot.app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by gxx on 2017-08-31.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "getInfo")
    public String getInfo(String name){
        userService.showInfo();
        return "-->"+name;
    }
}
