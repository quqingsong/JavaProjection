package com.dingler.PoJo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/5
 * @Content:实体类
 */


@Component("teacher")
public class Teacher {

    @Value("李四")
    private String name;

    public String getName() {
        return name;
    }

}