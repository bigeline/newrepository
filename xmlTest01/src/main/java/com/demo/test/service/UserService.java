package com.demo.test.service;

import com.demo.test.dynamicDataSource.DataSource;
import com.demo.test.dynamicDataSource.DataSourceEnum;
import com.demo.test.entity.User;

import java.util.List;
@DataSource(DataSourceEnum.DataSourceTest)
public interface UserService {
    List<User> getAllUser();
}
