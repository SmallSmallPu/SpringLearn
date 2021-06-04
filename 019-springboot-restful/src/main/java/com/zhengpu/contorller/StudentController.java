package com.zhengpu.contorller;

import com.zhengpu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("put")
    public String put(String key,String value){
        studentService.put(key,value);
        return "值已放入Redis";
    }

    @RequestMapping("get")
    public Object get(String key){
        Object value = studentService.get(key);
        return value;
    }
}
