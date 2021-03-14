package com.wjj.springcloud.controller;

import com.wjj.springcloud.pojo.User;
import com.wjj.springcloud.share.UserShare;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserShare userShare;

    @GetMapping("/user")
    public User getUser(){
        return userShare.getUser();
    }
}
