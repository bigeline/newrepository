package com.ssmTest.demo.service.impl;

import com.ssmTest.demo.entity.User;
import com.ssmTest.demo.mapper.UserMapper;
import com.ssmTest.demo.service.ServiceTest01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTest01Impl implements ServiceTest01 {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
