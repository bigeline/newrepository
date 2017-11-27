package com.demo.test.service;

import com.demo.test.dynamicDataSource.DataSource;
import com.demo.test.dynamicDataSource.DataSourceEnum;
import com.demo.test.entity.Student;

import java.util.List;
@DataSource(DataSourceEnum.DataSourceTest02)
public interface StudentService {
    List<Student> getAllStudent();
}
