package com.dingler.Service.ServiceImpl;

import com.dingler.Entity.User;
import com.dingler.Service.UserService;
import com.dingler.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}

