package com.zhengpu.controller;

import com.zhengpu.model.Student;
import com.zhengpu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/update")
    @ResponseBody
    public Object update(Integer id,String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return  studentService.updataStudentById(student);
    }
}
