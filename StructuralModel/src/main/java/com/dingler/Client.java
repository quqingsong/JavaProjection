package com.dingler;

import com.dingler.proxy.UserManagerImplProxy;
import com.dingler.service.UserManager;
import com.dingler.service.serviceImpl.UserManagerImpl;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/30
 * @Content:
 */

public class Client {

    public static void main(String[] args){
        //UserManager userManager=new UserManagerImpl();
        UserManager userManager=new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("1111", "张三");
    }
}