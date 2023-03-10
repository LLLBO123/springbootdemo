package com.lagou.controller;

import com.lagou.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/boot")
    public String hello(){
        return "你好,Spring Boot!";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/jdbc")
    public String jdbc(){
        return jdbcTemplate.toString();
    }

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public String showPersonInfo(){
        return person.toString();
    }

}
