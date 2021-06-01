package com.zhengpu.service.Impl;

import com.zhengpu.mapper.StudentMapper;
import com.zhengpu.model.Student;
import com.zhengpu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
