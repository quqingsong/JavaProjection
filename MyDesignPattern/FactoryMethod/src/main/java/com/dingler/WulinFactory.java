package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 22:59
 * @Email:1021237024@qq.com
 */

public class WulinFactory implements CarFactory{

    public Car getCar() {
        return new Wulin();
    }
}
