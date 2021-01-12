package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */

public class NormalMode {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        // 等凉菜 -- 必须要等待返回的结果，所以要调用join方法
        Thread t1 = new ColdDishThread();
        t1.start();
        t1.join();

        // 等包子 -- 必须要等待返回的结果，所以要调用join方法
        Thread t2 = new BumThread();
        t2.start();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("准备完毕时间："+(end-start));
    }
}