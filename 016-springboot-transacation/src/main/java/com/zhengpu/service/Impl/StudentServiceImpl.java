package com.zhengpu.service.Impl;

import com.zhengpu.mapper.StudentMapper;
import com.zhengpu.model.Student;
import com.zhengpu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    //开启事务只需要在需要开启事务的方法上加上一个@Transactional注解就行了
    @Transactional
    @Override
    public int updataStudentById(Student student) {
        int i = studentMapper.updateByPrimaryKey(student);
        int j = 10/0;
        return i;
    }
}
