package com.dingler.PoJo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/5
 * @Content: 实体类
 */


@Component("student")
public class Student {

    @Value("张三")
    private String name;

    @Resource
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

}