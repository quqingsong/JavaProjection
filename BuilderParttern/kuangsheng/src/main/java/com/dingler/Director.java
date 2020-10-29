package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:指挥是核心。负责指挥构建一个工程，工程如何构建，由他决定。
 */

//指挥工人按照顺序建造房子
public class Director {
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getproduct();
    }
}
