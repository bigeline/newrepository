package com.demo.test01.service.impl;

import com.demo.test01.entity.User;
import com.demo.test01.mapper.UserMapper;
import com.demo.test01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
