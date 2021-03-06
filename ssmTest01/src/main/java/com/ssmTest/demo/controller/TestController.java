package com.ssmTest.demo.controller;

import com.ssmTest.demo.entity.User;
import com.ssmTest.demo.service.ServiceTest01;
import com.ssmTest.demo.service.impl.ServiceTest01Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class TestController {
    @Autowired
    private ServiceTest01 serviceTest01Impl;

    @RequestMapping(value = "method01", method = RequestMethod.GET)
    public String method01() {
        System.out.println("方法测试01");
        return "home01";
    }

    @RequestMapping(value = "method02", method = RequestMethod.GET)
    public String method02() {
        System.out.println("方法测试02");
        List<User> list = serviceTest01Impl.getAllUser();
        for (User user : list) {
            System.out.println(user.toString());
        }
        return "home01";
    }

}
