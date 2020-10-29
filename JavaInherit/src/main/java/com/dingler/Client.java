package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */


//测试类
public class Client{
    public static void main(String args[]){
        Father father;

        father = new Son1();
        father.hitChild();

        father = new Son2();
        father.hitChild();

        father = new Son3();
        father.hitChild();
    }
}
