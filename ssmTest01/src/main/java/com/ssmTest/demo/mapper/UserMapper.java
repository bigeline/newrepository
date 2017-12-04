package com.ssmTest.demo.mapper;

import com.ssmTest.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();

    int insert(User user);
}
