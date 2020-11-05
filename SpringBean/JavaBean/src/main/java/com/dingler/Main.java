package com.dingler;

import com.dingler.Bean.BeansConfiguration;
import com.dingler.PoJo.Student;
import com.dingler.PoJo.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/5
 * @Content:
 */

public class Main {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Student student= (Student) context.getBean("student");
        Teacher teacher= (Teacher) context.getBean("teacher");
        System.out.println("学生的姓名："+student.getName()+"     老师是"+student.getTeacher().getName());
        System.out.println("老师的姓名："+teacher.getName());
    }

}