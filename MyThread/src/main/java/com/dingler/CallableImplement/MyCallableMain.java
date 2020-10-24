package com.dingler.CallableImplement;
/*
 * @author  qingsong
 * @date  2020/10/3 18:18
 * @Email:1021237024@qq.com
 */


import com.dingler.TraditionRunnable.MyRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableMain {

    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask<Integer>(myCallable);
        new Thread(futureTask).start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
