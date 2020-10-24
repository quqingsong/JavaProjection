package com.dingler.TraditionRunnableMethod;
/*
 * @author  qingsong
 * @date  2020/10/3 18:18
 * @Email:1021237024@qq.com
 */


public class MyRunnableMainMethod {

    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
//        MyRunnable myRunnable1=new MyRunnable();
//        MyRunnable myRunnable2=new MyRunnable();

        Thread thread=new Thread(myRunnable);
        Thread thread1=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);

        thread.setName("窗口一");
        thread1.setName("窗口二");
        thread2.setName("窗口三");
        thread.start();
        thread1.start();
        thread2.start();


    }
}
