package com.zhengpu.contorller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/say")
    public String say(){
        return "say:Hello,Springboot!";
    }

    @RequestMapping("/mapvalue")
    public Map<String,Object> mapvalue(){
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("message","Springboot Project");
        return retMap;
    }

}
