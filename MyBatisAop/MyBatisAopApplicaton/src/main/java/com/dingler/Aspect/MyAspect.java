package com.dingler.Aspect;

import com.dingler.usercontrolservice.UserControlMessage;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

/*
 * @author  qingsong
 * @date  2020/9/20 18:24
 * @Email:1021237024@qq.com
 */
@Aspect
@Component
public class MyAspect {
    @Autowired
    private UserControlMessage userControlMessage;

    @Pointcut("execution(* com.dingler.controller.*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void advice(JoinPoint joinPoint) {
        System.out.println("注解作用的方法名: " + joinPoint.getSignature().getName());

        System.out.println("所在类的简单类名: " + joinPoint.getSignature().getDeclaringType().getSimpleName());

        System.out.println("所在类的完整类名: " + joinPoint.getSignature().getDeclaringType());

        System.out.println("目标方法的声明类型: " + Modifier.toString(joinPoint.getSignature().getModifiers()));

    }

    @After("pointcut()")
    public void after() {
        userControlMessage.saveMessage("2020-11-5 12:13:01", "192.168.6.130", "127.0.0.1", 502, "三八沟", "一体化泵站", "SZBP", "1号水泵",
                "手动关状态", "成功");
    }
}
