package com.dingler.TraditionThreadMethod;
/*
 * @author  qingsong
 * @date  2020/10/3 18:18
 * @Email:1021237024@qq.com
 */


public class MyThreadMain {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread.setName("窗口一");
        myThread1.setName("窗口二");
        myThread2.setName("窗口三");

        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
