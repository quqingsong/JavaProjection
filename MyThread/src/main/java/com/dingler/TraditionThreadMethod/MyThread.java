package com.dingler.TraditionThreadMethod;
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
              show();
            }
    }

    private static synchronized void  show(){
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
