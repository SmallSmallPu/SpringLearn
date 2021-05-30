package com.zhengpu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class IndexController {

    @RequestMapping(value = "/springboot/say")

    public String say(){
        return "Hello Springboot!";
    }

}
