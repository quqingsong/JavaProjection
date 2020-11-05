package com;

import com.dingler.PoJo.Student;
import com.dingler.PoJo.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/5
 * @Content:
 */


public class Main {

    public static void main(String args[]){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Student student= (Student) applicationContext.getBean("student");
        Teacher teacher= (Teacher) applicationContext.getBean("teacher");
        System.out.println("学生的姓名："+student.getName()+"。老师是"+student.getTeacher().getName());
        System.out.println("老师的姓名："+teacher.getName());
    }

}