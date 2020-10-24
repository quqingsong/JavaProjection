package com.qingsong.controller;

import com.qingsong.entitty.User;
import com.qingsong.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: qingsong
 * @Date: 2019/3/7 11:24
 */

@RestController
public class userController {
    @Autowired
    UserRepository userRepository;

    /**
     * http://localhost:8080//user/query
     * @return
     */
    @GetMapping("/queryuser")
    public List<User> getUser(){
        List<User> user=userRepository.findAll();
        return user;
    }

    /**
     * http://localhost:8080//user?userType=1&userId=2&name=3&password=4
     * @param userType
     * @param userId
     * @param name
     * @param password
     * @return
     */
    @GetMapping("/user")
    public User insertUser(@RequestParam("userType") String userType,@RequestParam("userId") String userId,@RequestParam("name") String name, @RequestParam("password") String password){
        User user =new User();
        user.setUserType(userType);
        user.setUserid(userId);
        user.setName(name);
        user.setPassword(password);
        userRepository.save(user);
        return user;
    }

    /**
     * 登陆账号
     */
    @GetMapping("/login")
       public List<User> login(@RequestParam("userid") String userid, @RequestParam("password") String password){
      List<User> user=userRepository.queryByUseridAndPassword(userid,password);
       return  user;
   }

    @GetMapping("/login2")
    public List<User> loginUser(@RequestParam("userid") String userid, @RequestParam("password") String password){
        List<User> user=userRepository.selectprosess(userid,password);
        return  user;
    }

    @GetMapping("/login3")
    public List<User> loginfind(@RequestParam("userid") String userid, @RequestParam("password") String password){
        List<User> user=userRepository.findByUseridAndPassword(userid,password);
        return user;
    }
}
