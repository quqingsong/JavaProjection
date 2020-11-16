package com.dingler;


import com.dingler.pojo.User;
import com.dingler.utils.RedisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/16
 * @Content:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyApplicationTest {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

   @Test
   public void mytest(){
        redisTemplate.opsForValue().set("key","kuangsheng");
        System.out.println(redisTemplate.opsForValue().get("key"));

       redisTemplate.opsForValue().set("key1","狂神教育");
       System.out.println(redisTemplate.opsForValue().get("key1"));
    }

    @Test
    public void mytest1(){
        User user=new User("狂神说","男",18);
        redisTemplate.opsForValue().set("user",user);
    }

    @Test
    public void mytest2(){
        User user=new User("kuangshen","男",20);
        redisUtil.set("user1",user);
        System.out.println(redisUtil.get("user1"));
    }

}