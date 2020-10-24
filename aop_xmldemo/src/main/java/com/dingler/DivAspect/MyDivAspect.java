package com.dingler.DivAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * @author  qingsong
 * @date  2020/9/20 18:24
 * @Email:1021237024@qq.com
 */
public class MyDivAspect {
    public void before(){
        System.out.println("=====================方法执行前=====================");
    }

    public void after(){
        System.out.printf("=====================方法执行后=====================");
    }
}
