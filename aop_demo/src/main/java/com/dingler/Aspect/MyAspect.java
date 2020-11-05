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
    /**
     * execution（）               表达式的主体；
     * 第一个”*“符号             表示返回值的类型任意；
     * com.sample.service.impl	   AOP所切的服务的包名，即，我们的业务部分
     * 包名后面的“..”  	       表示当前包及子包
     * 第二个“*”  	           表示类名，*即所有类。此处可以自定义，下文有举例
     *   .*(..)	                   表示任何方法名，括号表示参数，两个点表示任何参数类型
     */
    @Before("execution(* com.dingler.service.serviceImpl..*.*(..))")
    public void before(){
        System.out.println("=====================方法执行前=====================");
    }

    @After("execution(* com.dingler.service.serviceImpl..*.*(..))")
    public void after(){
        System.out.printf("=====================方法执行后=====================\n");
    }
}
