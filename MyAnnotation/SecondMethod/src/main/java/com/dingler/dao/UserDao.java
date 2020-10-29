package com.dingler.dao;

import com.dingler.Entity.User;
import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */

@Component
public class UserDao {

    public User findUserById(Integer id) {
        if(id > 10) {
            return null;
        }
        return new User(id, "user-" + id);
    }
}
