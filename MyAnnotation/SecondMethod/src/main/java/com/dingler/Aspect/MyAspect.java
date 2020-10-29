package com.dingler.Aspect;

import com.dingler.Annotation.MyAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
    @Pointcut("@annotation(com.dingler.Annotation.MyAnnotation)")
    public void pointcut(){}

    @Before("pointcut() && @annotation(myAnnotation)")
    public void advice(JoinPoint joinPoint, MyAnnotation myAnnotation) {
        System.out.println("注解作用的方法名: " + joinPoint.getSignature().getName());

        System.out.println("所在类的简单类名: " + joinPoint.getSignature().getDeclaringType().getSimpleName());

        System.out.println("所在类的完整类名: " + joinPoint.getSignature().getDeclaringType());

        System.out.println("目标方法的声明类型: " + Modifier.toString(joinPoint.getSignature().getModifiers()));

        System.out.println("MyAnnotation日志的内容为[" + myAnnotation.value() + "] ---");
    }

    @After("pointcut() && @annotation(myAnnotation)")
    public void after(JoinPoint joinPoint, MyAnnotation myAnnotation) {
        System.out.println("注解作用的方法名: " + joinPoint.getSignature().getName());

        System.out.println("所在类的简单类名: " + joinPoint.getSignature().getDeclaringType().getSimpleName());

        System.out.println("所在类的完整类名: " + joinPoint.getSignature().getDeclaringType());

        System.out.println("目标方法的声明类型: " + Modifier.toString(joinPoint.getSignature().getModifiers()));

        System.out.println("MyAnnotation日志的内容为[" + myAnnotation.value() + "] ---");
    }
}
