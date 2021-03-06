package com.dingler.TraditionRunnableMethod;/*
 * @author  qingsong
 * @date  2020/10/3 18:12
 * @Email:1021237024@qq.com
 */

public class MyRunnable implements Runnable {

    private int ticket=100;


    public void run() {
        while (true){
            show();
        }
    }

    public synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}
