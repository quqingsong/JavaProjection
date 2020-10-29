package com.dingler.Service.ServiceImpl;

import com.dingler.Annotation.MyAnnotation;
import com.dingler.Service.Message;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:
 */

@MyAnnotation
public class MessageImpl implements Message {

    @MyAnnotation(msg = "我是自定义注解信息...")
    public void msg() {
        // TODO Auto-generated method stub
    }
}
