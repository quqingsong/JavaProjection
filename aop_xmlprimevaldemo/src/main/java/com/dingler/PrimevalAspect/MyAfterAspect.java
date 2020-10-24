package com.dingler.PrimevalAspect;
/*
 * @author  qingsong
 * @date  2020/9/20 20:31
 * @Email:1021237024@qq.com
 */

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAspect implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.printf("=====================方法执行后=====================");
    }
}
