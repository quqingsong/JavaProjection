package com.dingler.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/11/16
 * @Content:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    //用户姓名
    private String name;
    //用户性别
    private String sex;
    //用户年龄
    private int age;
}
