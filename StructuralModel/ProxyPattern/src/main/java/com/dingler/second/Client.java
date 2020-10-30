package com.dingler.second;

import com.dingler.second.proxy.Proxy;
import com.dingler.second.service.serviceImpl.Host;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/30
 * @Content:
 */
public class Client {
    public static void main(String[] args) {
        //方法1，房东直接将房子出租出去。
        System.out.println("方法一：房东自己将房子出租");
        Host host=new Host();
        host.rent();
        System.out.println("\n");

        //方法2，房东通过中介代理将房子出租出去。
        System.out.println("方法二：中介将房东房子出租");
        Host host1=new Host();
        Proxy proxy=new Proxy(host1);
        proxy.rent();

    }
}
