package com.dingler.Customizing;

import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */
public class MyFuture<T> implements Runnable {

    // volatile保证各线程内存的可见性，一定要加上
    // 不然 get()方法可能会一直阻塞没有结果返回
    private volatile Object result;
    private MyCallable<T> myCallable;

    public MyFuture(MyCallable<T> myCallable) {
        this.myCallable = myCallable;
    }

    @Override
    public void run() {
        // 调用call的方法
        Object tempResult = myCallable.call();
        // 将call方法返回的结果，给到result成员变量
        result = tempResult;
    }

    // 阻塞方法，一直阻塞，直到拿到结果
    public Object get(){
        // 结果没有返回，一直阻塞（这里会一直耗用cpu的资源）
        while (result == null);
        return result;
    }

    // 限时阻塞，在一定时间内阻塞，timeout后返回null
    public Object get(long delta, TemporalUnit timeUnit){
        LocalDateTime localDateTime = LocalDateTime.now().plus(delta,timeUnit);
        // 结果没有返回会阻塞delta时间，单位为timeUnit，如果result有值就返回，
        // 没有，那么达到预定时间会返回null,不会一直阻塞，你也可以抛出相应的异常
        while (result == null && localDateTime.compareTo(LocalDateTime.now()) >= 0);
        return result;
    }
}