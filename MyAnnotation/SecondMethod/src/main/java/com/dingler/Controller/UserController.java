package com.dingler.Controller;

import com.dingler.Annotation.MyAnnotation;
import com.dingler.Entity.User;
import com.dingler.Service.ServiceImpl.UserServiceImpl;
import com.dingler.Service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */


@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @MyAnnotation(value = "这是日志内容")
    @RequestMapping("user/{id}")
    public User findUser(@PathVariable("id") Integer id) {
        System.out.println("User = " + userService.findUserById(id).toString());
        return userService.findUserById(id);
    }
}
