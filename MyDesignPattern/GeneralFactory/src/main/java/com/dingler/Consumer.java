package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/24 23:59
 * @Email:1021237024@qq.com
 */

public class Consumer {
    public static void main(String[] args) {
        Car car1=CarFactory.getCar("五菱");
        Car car2=CarFactory.getCar("特斯拉");

        car1.name();
        car2.name();
    }
}
