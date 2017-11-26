package com.demo.test01.mapper;

import com.demo.test01.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();
}
