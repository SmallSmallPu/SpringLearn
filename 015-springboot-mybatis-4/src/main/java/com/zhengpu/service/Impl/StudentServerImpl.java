package com.zhengpu.service.Impl;

import com.zhengpu.mapper.StudentMapper;
import com.zhengpu.model.Student;
import com.zhengpu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServerImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
