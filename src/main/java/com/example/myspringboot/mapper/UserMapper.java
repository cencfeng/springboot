package com.example.myspringboot.mapper;

import com.example.myspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUser(User user);
    User getByUserName(String username);
}
