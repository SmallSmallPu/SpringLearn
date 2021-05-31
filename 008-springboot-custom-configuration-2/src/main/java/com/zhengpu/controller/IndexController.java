package com.zhengpu.controller;

import com.zhengpu.config.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    private School school;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){

        return school.getName()+":"+school.getWebsite();
    }
}
