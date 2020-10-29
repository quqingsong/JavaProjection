package com.dinngler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:
 */
public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer=new Laptop(new  Apple());
        computer.info();

        Computer computer1=new Desktop(new Lenovo());
        computer1.info();
    }
}
