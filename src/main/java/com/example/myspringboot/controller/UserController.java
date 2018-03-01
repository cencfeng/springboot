package com.example.myspringboot.controller;

import com.example.myspringboot.entity.User;
import com.example.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(User user){
        user = userService.getUser(user);
        if(user != null){
            return  "menu";
        }
        System.out.println("1111");
        return "failed";
    }
}
