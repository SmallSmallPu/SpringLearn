package com.zhengpu.controller;

import com.zhengpu.model.Student;
import org.springframework.web.bind.annotation.*;

//学习SpringMVC的常用注解


//使用如下注解之后，当前控制层返回的永远都是Json对象
@RestController
public class StudentController {

    @RequestMapping("student")
    public Object student(){
        Student student = new Student();
        student.setId(17);
        student.setName("wang");
        return student;
    }


    //该方法请求方式支持：Get和POST请求
//    @RequestMapping(value = "studentDetail",method = RequestMethod.GET)
    @GetMapping("studentDetail")//相当于上一句话，只支持Get请求
//    该注解通常在查询数据的时候使用 ->对应SQL查询
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

    @PostMapping("student")
//    该注解通常在新增数据的时候使用 ->对应SQL新增
    public Object student2(){

        return "Post Method";
    }

    @DeleteMapping("student")
    public Object delete(){
        return "Delete Method";
    }

    @PutMapping("student")
    public Object update(){
        return "Update Method";
    }
}
