package com.demo.test.controller;

import com.demo.test.entity.User;
import com.demo.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@RequestMapping("/userController")
public class UserController {
    @Resource
    private UserService userServiceImpl;

    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request, Model model) {
        List<User> allUser = userServiceImpl.getAllUser();
        for (User user : allUser) {
            System.out.println(user.toString());
        }
        model.addAttribute("user", allUser.get(0));
        return "showUser";
    }
}
