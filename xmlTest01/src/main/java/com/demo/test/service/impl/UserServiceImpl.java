package com.demo.test.service.impl;

import com.demo.test.dynamicDataSource.DataSource;
import com.demo.test.dynamicDataSource.DataSourceEnum;
import com.demo.test.entity.User;
import com.demo.test.mapper.UserMapper;
import com.demo.test.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        PageHelper.startPage(1, 10);
        List<User> allUser = userMapper.getAllUser();
        PageInfo<User> p = new PageInfo<User>(allUser);
        return allUser;
    }
}
