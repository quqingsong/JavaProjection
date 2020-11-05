package com.dingler.Bean;

import com.dingler.PoJo.Student;
import com.dingler.PoJo.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/5
 * @Content:
 */


@Configuration
public class BeansConfiguration {

    @Bean
    public Student student(){
        Student student=new Student();
        student.setName("张三");
        student.setTeacher(teacher());
        return student;
    }

    @Bean
    public Teacher teacher(){
        Teacher teacher=new Teacher();
        teacher.setName("李四");
        return teacher;
    }

}