package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 23:47
 * @Email:1021237024@qq.com
 */

public class Xiaomiphine implements IphoneProduct {
    public void start() {
        System.out.println("开启小米手机");
    }

    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    public void callup() {
        System.out.println("小米手机打电话");
    }

    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}
