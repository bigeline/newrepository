package com.demo.test.controller;

import com.demo.test.entity.Student;
import com.demo.test.entity.User;
import com.demo.test.service.StudentService;
import com.demo.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/studentController")
public class StudentController {
    @Resource
    private StudentService studentServiceImpl;
    @Resource
    private UserService userServiceImpl;

    @RequestMapping("getAllStudents")
    public void getAllStudent() {
        List<Student> students = studentServiceImpl.getAllStudent();
        if (students != null && students.size() > 0) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        List<User> allUser = userServiceImpl.getAllUser();
        if (allUser != null && allUser.size() > 0) {
            for (User user : allUser) {
                System.out.println(user);
            }
        }
    }
}
