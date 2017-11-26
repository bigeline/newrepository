package com.demo.test01.service;

import com.demo.test01.entity.User;
import com.demo.test01.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
}
