package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */



public class Client2 {
    public static void main(String[] args) {

        //子类重写父类方法，就会优先调用子类方法，否则调用父类方法。
        Father2 father2 = new Child();
        father2.func1();//打印结果将会是什么？
        father2.func2();
        father2.func3();

    }


}