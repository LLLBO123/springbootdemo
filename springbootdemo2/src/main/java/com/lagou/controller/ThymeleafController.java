package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ThymeleafController {

    @RequestMapping("/getLocale")
    public String getLocale(){
        //resources/templates/index.html
        return "index";   //前缀：resources/templates    后缀： .html
    }

}
