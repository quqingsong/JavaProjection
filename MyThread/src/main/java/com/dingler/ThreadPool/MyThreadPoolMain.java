package com.dingler.ThreadPool;
/*
 * @author  qingsong
 * @date  2020/10/3 18:18
 * @Email:1021237024@qq.com
 */


import com.dingler.TraditionRunnable.MyRunnable;

import java.util.concurrent.*;

public class MyThreadPoolMain {

    public static void main(String[] args) {
        //方法一
//        ExecutorService executorService= Executors.newFixedThreadPool(3);
//
//        executorService.execute(new ThreadPool());
//        executorService.shutdown();



        //方法二
       final ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(3,5,60, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(5),Executors.defaultThreadFactory());

        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new ThreadPool());
        }
        threadPoolExecutor.shutdown();
    }
}
