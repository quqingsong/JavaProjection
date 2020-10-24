package com.dingler.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 * @author  qingsong
 * @date  2020/9/20 18:24
 * @Email:1021237024@qq.com
 */
@Aspect
@Component
public class MyAspect {
    @Before("execution(* com.dingler.service.serviceImpl..*.*(..))")
    public void before(){
        System.out.println("=====================方法执行前=====================");
    }

    @After("execution(* com.dingler.service.serviceImpl..*.*(..))")
    public void after(){
        System.out.printf("=====================方法执行后=====================\n");
    }
}
