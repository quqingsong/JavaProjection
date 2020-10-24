package com.qingsong.repository;

import com.qingsong.entitty.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/23 16:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    public UserRepository userRepository;

    @Test
    public void test(){
        List<User> users=userRepository.findByUseridAndPassword("1","1");
        System.out.println(users);
    }
    @Test
    public void test2(){
        List<User> users=userRepository.findAll();
        System.out.println(users);
    }

}