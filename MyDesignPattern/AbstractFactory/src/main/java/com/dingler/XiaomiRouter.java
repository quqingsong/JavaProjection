package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 23:52
 * @Email:1021237024@qq.com
 */

public class XiaomiRouter implements IrouteProduct {
    public void start() {
        System.out.println("启动小米路由器");
    }

    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    public void openwifi() {
        System.out.println("开启小米路由器");
    }

    public void setting() {
        System.out.println("设置小米路由器");
    }
}
