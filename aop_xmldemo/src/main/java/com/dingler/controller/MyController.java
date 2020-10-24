package com.dingler.controller;
/*
 * @author  qingsong
 * @date  2020/9/20 19:00
 * @Email:1021237024@qq.com
 */

import com.dingler.service.StudentManage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");

    @GetMapping("/select")
    public String select(){
      StudentManage studentManage= (StudentManage) applicationContext.getBean("studentManage");
        return studentManage.selectStudent();
    }
}
