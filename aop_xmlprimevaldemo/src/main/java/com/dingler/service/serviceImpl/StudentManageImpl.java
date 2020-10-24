package com.dingler.service.serviceImpl;
/*
 * @author  qingsong
 * @date  2020/9/19 20:55
 * @Email:1021237024@qq.com
 */

import com.dingler.service.StudentManage;
import org.springframework.stereotype.Service;

@Service
public class StudentManageImpl implements StudentManage {
    public void addStudent() {
        System.out.println("添加学生信息");
    }

    public void alterStudent() {
        System.out.println("修改学生信息");
    }

    public void deleteStudent() {
        System.out.println("删除学生信息");
    }

    public String selectStudent() {
        String selectstudent="查询学生信息";
        System.out.println("查询学生信息");
        return selectstudent;
    }
}
