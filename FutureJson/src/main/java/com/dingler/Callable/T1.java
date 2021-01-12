package com.dingler.Callable;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2021/1/12
 * @Content:
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class T1 {

    public static void main(String[] args) throws Exception {

        //定义返回值集合
        List<Future<JSONObject>> resultList = new ArrayList();
        //创建一个线程池
        ExecutorService taskExecutor = Executors.newFixedThreadPool(3);
        //执行多线程
        for (int i = 0; i < 4; i++) {//【实际使用中，这里可以是批量数据的循环】
            //定义要传入线程中的参数
            JSONObject param = new JSONObject(true);
            param.put("index", i);
            //创建线程执行类对象
            MyCallable c = new MyCallable(param);
            //执行线程并获取执行结果
            Future<JSONObject> f = taskExecutor.submit(c);
            //将执行结果存入集合
            resultList.add(f);
        }
        //关闭线程池
        taskExecutor.shutdown();
        //批量处理线程执行结果
        for (Future<JSONObject> future : resultList) {
            if (future != null);
            //这个get方法会阻塞直到获取到线程的执行结果
            JSONObject map = future.get();
            System.out.println(map);
        }
    }
}

//自定义线程处理类
class MyCallable implements Callable<JSONObject> {

    private JSONObject paramMap;

    public MyCallable(JSONObject paramMap) {
        super();
        this.paramMap = paramMap;
    }

    //call方法的返回值可以是任意类型，和Callable<Map<String,Object>>一致即可
    @Override
    public JSONObject call() throws Exception {
        //定义返回map
        JSONObject rtnMap = new JSONObject();
        //获取参数中的内容
        Integer index = (Integer) paramMap.get("index");
        //处理业务逻辑
        int sum = 0;
        for (int i = 0; i <= index; i++) {
            System.out.println("index:"+index +"--- "+i);
            sum += i;
        }
        //返回业务逻辑结果
        rtnMap.put("index", index);
        rtnMap.put("sum", sum);
        return rtnMap;
    }

}