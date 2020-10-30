package com.dingler.second.service.serviceImpl;

import com.dingler.second.service.Rent;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/30
 * @Content:
 */
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要出租房子了！");
    }
}
