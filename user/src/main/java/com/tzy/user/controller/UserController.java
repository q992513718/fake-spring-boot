package com.tzy.user.controller;


import com.tzy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("test")
    public String test() {
        return userService.test();
    }
}
