package com.dingler.PoJo;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/5
 * @Content: 实体类
 */


public class Student {

    private String name;

    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}