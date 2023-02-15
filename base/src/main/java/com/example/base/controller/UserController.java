package com.example.base.controller;

import com.example.base.pojo.User;
import com.example.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public List<User> queryAll() {
        return userService.queryAll();
    }

    @RequestMapping("/query/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }


    @PostMapping("/delete/{id}")
    public String delete(Integer id){
        userService.deleteByID(id);
        return "success";
    }

    @PutMapping("/update")
    public String update(User user){
        userService.update(user);
        return "success";
    }

}
