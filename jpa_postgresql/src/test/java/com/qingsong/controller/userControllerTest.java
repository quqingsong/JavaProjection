package com.qingsong.controller;

import com.qingsong.entitty.User;
import com.qingsong.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/23 17:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class userControllerTest {

    @Autowired
    public UserRepository userRepository;

    @Test
    public void getUser() {

            List<User> users=userRepository.findAll();
        for (User u:users
             ) {
            System.out.println(u);
        }



    }
}