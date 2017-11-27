package com.demo.test.service.impl;

import com.demo.test.dynamicDataSource.DataSource;
import com.demo.test.dynamicDataSource.DataSourceEnum;
import com.demo.test.entity.Student;
import com.demo.test.mapper.StudentMapper;
import com.demo.test.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
