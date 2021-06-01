package com.zhengpu.controller;

import com.zhengpu.model.Student;
import com.zhengpu.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api/")
public class StudentController {

    @Resource
    private StudentService studentService;


    @RequestMapping("student")
    @ResponseBody
    public Student selectByPrimaryKey(Integer id){
        return studentService.selectByPrimaryKey(id);
    }
}
