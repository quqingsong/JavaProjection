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
public class CachedThreadPoolDemo {


    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int s = i;
            executorService.execute(() -> {
                try {
                    System.out.println("" + s + ";;;" + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        Thread.sleep(2000);//2s
        executorService.execute(() -> {
            try {

                System.out.println(";;;" + Thread.currentThread().getName());

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}