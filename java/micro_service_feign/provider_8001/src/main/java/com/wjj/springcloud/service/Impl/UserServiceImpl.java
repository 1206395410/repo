package com.wjj.springcloud.service.Impl;

import com.wjj.springcloud.pojo.User;
import com.wjj.springcloud.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public User getUser(){
        User user = new User();
        user.setName("小红");
        user.setSex(0);
        return user;
    }
}
