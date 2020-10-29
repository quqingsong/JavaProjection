package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */
//子类1
public class Son1 extends Father {
    //重写父类打孩子方法
    public void hitChild(){
        System.out.println("为什么打我？我做错什么了！");
    }
}