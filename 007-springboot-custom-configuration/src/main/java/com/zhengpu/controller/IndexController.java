package com.zhengpu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

//    获取配置文件中自定义的值,大括号中为key的名字
    @Value("${school.name}")
    private String schoolName;

    @Value("${website}")
    private String website;

    @RequestMapping("/say")
    public String say(){

        return "Hello:"+schoolName+":"+website;
    }
}
