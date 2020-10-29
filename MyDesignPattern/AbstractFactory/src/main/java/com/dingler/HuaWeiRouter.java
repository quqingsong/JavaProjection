package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 23:52
 * @Email:1021237024@qq.com
 */

public class HuaWeiRouter implements IrouteProduct {
    public void start() {
        System.out.println("启动华为路由器");
    }

    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    public void openwifi() {
        System.out.println("开启华为路由器");
    }

    public void setting() {
        System.out.println("设置华为路由器");
    }
}
