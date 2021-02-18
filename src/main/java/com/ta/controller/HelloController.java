package com.ta.controller;

import com.ta.pojo.User;
import com.ta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello/{id}")
    public List<User> hello(@PathVariable int id){
        List<User> users = userService.findById(id);
        return users;
    }

}
