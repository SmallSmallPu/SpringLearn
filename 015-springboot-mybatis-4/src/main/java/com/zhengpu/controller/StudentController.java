package com.zhengpu.controller;

import com.zhengpu.model.Student;
import com.zhengpu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("student")
    @ResponseBody
    public Student say(Integer id){
        return studentService.selectById(id);
    }

}
