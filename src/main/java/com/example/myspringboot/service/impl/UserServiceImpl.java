package com.example.myspringboot.service.impl;

import com.example.myspringboot.entity.User;
import com.example.myspringboot.mapper.UserMapper;
import com.example.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }
}
