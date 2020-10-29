package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */


import com.dingler.Annotation.MyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyClient {

    Annotation[] annotation = null;

    public static void main(String[] args) throws ClassNotFoundException {
        new MyClient().getAnnotation();
    }

    private void getAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.dingler.Service.ServiceImpl.MessageImpl"); //
        boolean isEmpty = clazz.isAnnotationPresent(MyAnnotation.class); //判断clazz是否使用了MyAnnotation自定义注解
        if (isEmpty) {
            annotation = clazz.getAnnotations(); //获取注解接口
            for (Annotation a : annotation) {
                MyAnnotation my = (MyAnnotation) a; //强制转换成MyAnnotation类型
                System.out.println(clazz + "--" + my.msg());
            }
        }

        Method[] method = clazz.getMethods();
        System.out.println("Method");
        for (Method m : method) {
            boolean ismEmpty = clazz.isAnnotationPresent(MyAnnotation.class);
            if (ismEmpty) {
                Annotation[] aa = m.getAnnotations();
                for (Annotation a : aa) {
                    MyAnnotation my = (MyAnnotation) a;
                    System.out.println(m + "--" + my.msg());
                }
            }
        }
    }
}
