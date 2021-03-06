package com.dingler.Annotation;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */


import java.lang.annotation.*;

/**
 * 自定义注解
 * @author Le
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "自定义注解"; //default 默认值
}
