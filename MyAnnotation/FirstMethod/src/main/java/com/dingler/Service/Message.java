package com.dingler.Service;

import com.dingler.Annotation.MyAnnotation;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */

@MyAnnotation //使用自定义注解
public interface Message {

    @MyAnnotation
    public void msg();
}

