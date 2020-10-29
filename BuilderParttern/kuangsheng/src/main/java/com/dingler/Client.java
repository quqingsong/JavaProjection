package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:主启动测试类
 */
public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        Product product=director.build(new Worker());
        System.out.println(product.toString());
    }
}
