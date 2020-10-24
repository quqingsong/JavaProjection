package com.dingler.PrimevalAspect;
/*
 * @author  qingsong
 * @date  2020/9/20 20:30
 * @Email:1021237024@qq.com
 */

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAspect implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("=====================方法执行前=====================");
    }
}
