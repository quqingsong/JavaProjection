package com.dingler.second.proxy;

import com.dingler.second.service.Rent;
import com.dingler.second.service.serviceImpl.Host;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/30
 * @Content:
 */
public class Proxy implements Rent {
    //利用组合，少用继承。
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    //中介代理将房东房子出租。
    public void rent() {
        seeHouse();
        host.rent();
        writeContract();
    }

    //中介带你看房
    public void seeHouse(){
        System.out.println("房东将房子托管在中介代理，由中介处理房子出租问题。");
        System.out.println("中介带你看房！");
    }

    //中介签合同
    public void writeContract(){
        System.out.println("中介签合同");
    }
}
