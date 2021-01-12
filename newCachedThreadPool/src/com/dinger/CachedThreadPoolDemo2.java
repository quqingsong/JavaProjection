package com.dinger;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/6/27.
 */
public class CachedThreadPoolDemo2 {


    public static void main(String[] args) throws InterruptedException {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                System.out.println("睡起来...");
                Thread.sleep(index * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index + "当前线程" + Thread.currentThread().getName());
                }
            });

        }


    }
}