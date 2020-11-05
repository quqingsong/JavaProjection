package com.dingler.controller;
/*
 * @author  qingsong
 * @date  2020/9/20 19:00
 * @Email:1021237024@qq.com
 */

import com.dingler.service.StudentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {



    @Autowired
    private StudentManageService studentManageService;

    @GetMapping("/select")
    public String select(){
        return studentManageService.selectStudent();
    }

    @GetMapping("/add")
    public String add(){
        return studentManageService.addStudent();
    }
}
