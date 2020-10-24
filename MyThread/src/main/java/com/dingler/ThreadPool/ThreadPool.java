package com.dingler.ThreadPool;
/*
 * @author  qingsong
 * @date  2020/10/6 17:05
 * @Email:1021237024@qq.com
 */

public class ThreadPool implements Runnable{

    private int ticket=100;

    public void run() {
        while (true){
            //同步方法一:传入一个对象。
//            synchronized (object) {
            //同步方法二:this。
            synchronized (this){
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
        }

    }
}
