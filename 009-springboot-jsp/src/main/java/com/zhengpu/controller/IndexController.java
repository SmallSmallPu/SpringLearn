package com.zhengpu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/say")
    public ModelAndView say(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","Hello,Springboot");
        modelAndView.setViewName("say");
        return modelAndView;
    }

//    将model 和 view拆开了
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","Hello");
        return "say";
    }
}
