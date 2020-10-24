package com.dingler.TraditionThread;
/*
 * @author  qingsong
 * @date  2020/10/3 18:12
 * @Email:1021237024@qq.com
 */

public class MyThread extends Thread {

    private static int ticket=100;
   private static Object object=new Object();

    @Override
    public void run() {
        while (true){
//            synchronized (object) {
            //this在这里不能使用，因为this对应的对象有3个。类只会加载一次。
            synchronized (MyThread.class){
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
