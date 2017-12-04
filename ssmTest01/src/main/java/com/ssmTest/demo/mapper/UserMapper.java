package com.ssmTest.demo.mapper;

import com.ssmTest.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 获取所有用户
     */
    List<User> getAllUser();
}
