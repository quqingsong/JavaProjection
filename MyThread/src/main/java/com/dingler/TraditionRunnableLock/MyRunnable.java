package com.dingler.TraditionRunnableLock;/*
 * @author  qingsong
 * @date  2020/10/3 18:12
 * @Email:1021237024@qq.com
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

    private int ticket=100;
    Object object =new Object();

    private ReentrantLock reentrantLock=new ReentrantLock();


    public void run() {
        while (true){
            //添加同步锁
            reentrantLock.lock();
            try {
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
            }finally {
                //调用解锁方法
                reentrantLock.unlock();
            }
        }
    }
}
