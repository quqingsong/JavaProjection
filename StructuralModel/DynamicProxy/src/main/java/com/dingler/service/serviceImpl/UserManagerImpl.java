package com.dingler.service.serviceImpl;

import com.dingler.service.UserManager;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/30
 * @Content:
 */
public class UserManagerImpl implements UserManager {

    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    public void delUser(String userId) {
        System.out.println("UserManagerImpl.delUser");
    }

    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser");
        return "张三";
    }

    public void modifyUser(String userId, String userName) {
        System.out.println("UserManagerImpl.modifyUser");
    }
}
