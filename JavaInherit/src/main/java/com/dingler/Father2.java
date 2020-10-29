package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */
public class Father2 {
    public void func1(){
        func2();
    }
    public void func2(){
        System.out.println("父类222");
    }
    public void func3(){
        System.out.println("父类类333");
    }
}

class Child extends Father2 {

    public void func1(int i){
        System.out.println("子类111");
    }

    public void func2(){
        System.out.println("子类222");
    }

    public void func3(){
        System.out.println("子类333");
    }

}