package com.demo.test01.controller;

import com.demo.test01.entity.User;
import com.demo.test01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<User> allUser = userService.getAllUser();
        for(User user:allUser){
            System.out.println(user.getUserId()+":"+user.getUserName());
        }
        model.addAttribute("user",allUser.get(0));
        return "showUser";
    }
}
