package com.dingler.Customizing;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */
public class Test {

    public static void main(String[] args) {
        // 这里用到了java8的lamda表达式重写call方法
        MyFuture<String> myFutrue = new MyFuture<>(()->{
            try {
                // 模拟业务操作，睡3秒
                TimeUnit.SECONDS.sleep(3);
            }catch (Exception e){

            }
            return "hello";
        });
        new Thread(myFutrue).start();

        // System.out.println(myFutrue.get()); 阻塞三秒后返回hello
        // System.out.println(myFutrue.get(2, ChronoUnit.SECONDS)); 阻塞两秒后，返回null
        System.out.println(myFutrue.get(4, ChronoUnit.SECONDS));// 阻塞3秒后返回hello
    }
}