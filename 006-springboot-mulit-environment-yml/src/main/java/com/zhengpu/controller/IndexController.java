package com.zhengpu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/say")
    public String say(){
        return "Hello,Springboot!";
    }
}
