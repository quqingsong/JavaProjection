package com.dingler;

import com.dingler.proxy.MyLogHandler;
import com.dingler.service.UserManager;
import com.dingler.service.serviceImpl.UserManagerImpl;
import sun.rmi.log.LogHandler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/30
 * @Content:
 */

public class Client {

    public static void main(String[] args){
        MyLogHandler myLogHandler=new MyLogHandler();
        UserManager userManager=(UserManager)myLogHandler.newProxyInstance(new UserManagerImpl());
        //UserManager userManager=new UserManagerImpl();
        userManager.addUser("1111", "张三");
    }
}