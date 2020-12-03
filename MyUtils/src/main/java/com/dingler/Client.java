package com.dingler;

import com.dingler.ip.CustomSystemUtil;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/12/3
 * @Content:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("内网ip：" + CustomSystemUtil.INTRANET_IP);
        System.out.println("外网ip: " + CustomSystemUtil.INTERNET_IP);
    }
}
