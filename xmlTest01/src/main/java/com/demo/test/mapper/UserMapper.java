package com.demo.test.mapper;

import com.demo.test.dynamicDataSource.DataSource;
import com.demo.test.dynamicDataSource.DataSourceEnum;
import com.demo.test.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();
}
