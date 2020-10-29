package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */
//子类2
public class Son2 extends com.dingler.Father {
    //重写父类打孩子方法
    public void hitChild(){
        System.out.println("我知道错了，别打了！");
    }
}