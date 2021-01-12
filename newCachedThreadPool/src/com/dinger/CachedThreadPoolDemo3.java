package com.dinger;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

/*
 一 常见线程池之
 *         newCachedThreadDemo
 *             1 可以根据需要创建新的线程的线程池
 *             2 旧的线程可用时，将重用他们。        第一个任务完成，第二个任务会复用第一个线程，不会新建线程
 *             3 当旧的线程不可用时，才会创建新的线程。 终止并且从缓存中移除 60秒未使用的线程
 *             4 所有该线程就算长时间保持空闲，也不会使用任何资源
 *             5 任何任务来了就能执行，不需要等待
 *
 *    场景？
 *          对于执行 许多短期异步的程序。
 *          大量，耗时少的任务
 *        可以提高效率
 *
 二 真实的 newCacheThreadPool()
    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(
        0,                    //核心线程数量 0
        Integer.MAX_VALUE,    //最大线程数量时Integer型的最大值，是2147483647。
        60L,                //非核心线程生存时间 60秒
        TimeUnit.SECONDS,    //空闲时间单位  秒
        new SynchronousQueue<Runnable>()); //等待队列  SynchronousQueue
    }

  三 SynchronousQueue 队列是个啥？
        1.是阻塞队列 BlockingQueue 的一种，所以线程上是安全的
        2.SynchronousQueue的容量是0，不存储任何元素
        3.更是在线程之间移交任务  在两个线程之间传递同一个对象
          当有item 来的时候，  insert操作。需要等待其他线程来接收。其他线程做remove操作。
          当删除 item， remove操作，也是一样的。

  四  拒绝策略  默认的  AbortPolicy。
      public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory) {
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
             threadFactory, defaultHandler);
    }

    private static final RejectedExecutionHandler defaultHandler =
        new AbortPolicy();
        和它相关的任务 都不执行  线程池默认的拒绝方式
 *
 */
public class CachedThreadPoolDemo3 {
    public static void main(String[] args) {
        ExecutorService cachePool = Executors.newCachedThreadPool();     //创建可以缓存的线程池

        //来6个线程试一下
        CacheThread cacheThread = new CacheThread();
        CacheThread cacheThread2 = new CacheThread();
        CacheThread cacheThread3 = new CacheThread();
        CacheThread cacheThread4 = new CacheThread();
        CacheThread cacheThread5 = new CacheThread();
        CacheThread cacheThread6 = new CacheThread();

        cachePool.execute(cacheThread);
        cachePool.execute(cacheThread2);
        cachePool.execute(cacheThread3);
        try {
            cacheThread3.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cachePool.execute(cacheThread4);
        cachePool.execute(cacheThread5);
        cachePool.execute(cacheThread6);

        Runnable task = new Runnable() {
            public void run() {
                System.out.println("new 一个  runnable接口， 实现多线程");
                System.out.println("当前执行线程的名字" + Thread.currentThread().getName());
            }
        };

        cachePool.execute(task);    //线程池中执行任务

        cachePool.shutdown();        //渐进式的关闭线程池
    }
}

class CacheThread extends Thread{
    @Override
    public void run() {
        System.out.println("当前执行线程的名字" + Thread.currentThread().getName());
    }
}