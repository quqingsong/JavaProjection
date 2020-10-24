package com.dingler.CallableImplement;/*
 * @author  qingsong
 * @date  2020/10/3 18:12
 * @Email:1021237024@qq.com
 */

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private int ticket=100;

    public Integer call() throws Exception {
        while (true){
            //同步方法一:传入一个对象。
//            synchronized (object) {
            //同步方法二:this。
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
        }
        return 1;
    }
}
