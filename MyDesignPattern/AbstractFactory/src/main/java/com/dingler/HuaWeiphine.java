package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 23:47
 * @Email:1021237024@qq.com
 */

public class HuaWeiphine implements IphoneProduct {
    public void start() {
        System.out.println("开启华为手机");
    }

    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    public void callup() {
        System.out.println("华为手机打电话");
    }

    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
