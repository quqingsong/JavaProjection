package com.dingler.service;
/*
 * @author  qingsong
 * @date  2020/9/19 20:46
 * @Email:1021237024@qq.com
 */

public interface StudentManage {
    //添加学生信息
    public void addStudent();
    //修改学生信息
    public void alterStudent();
    //删除学生信息
    public void deleteStudent();
    //查找学生信息
    public String selectStudent();
}
