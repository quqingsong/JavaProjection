package com.dingler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */
public class secondFutureDemo2 {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
      //定长线程
  ExecutorService executor = Executors.newFixedThreadPool(2);
  //创建一个Callable，3秒后返回String类型
      Callable myCallable = new Callable() {
  @Override
  public String call() throws Exception {
  Thread.sleep(5000);
  System.out.println("calld方法执行了");
  return "call方法返回值";
  }
      };
      Callable myCallable2 = new Callable() {
  @Override
  public String call() throws Exception {
  Thread.sleep(3000);
  System.out.println("calld2方法执行了");
  return "call2方法返回值";
  }
      };
      System.out.println("提交任务之前 "+getStringDate());
      Future future = executor.submit(myCallable);
      Future future2 = executor.submit(myCallable2);
      System.out.println("提交任务之后 "+getStringDate());
      System.out.println("开始获取第一个返回值 "+getStringDate());
      System.out.println("获取返回值: "+future.get());
      System.out.println("获取第一个返回值结束，开始获取第二个返回值 "+getStringDate());
      System.out.println("获取返回值2: "+future2.get());
      System.out.println("获取第二个返回值结束 "+getStringDate());
  }
  public static String getStringDate() {
    Date currentTime = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    String dateString = formatter.format(currentTime);
    return dateString;
    }
  }
