package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/24 23:59
 * @Email:1021237024@qq.com
 */

public class Consumer {
    public static void main(String[] args) {
        Car car1=new WulinFactory().getCar();
        Car car2=new TesilaFactory().getCar();
        Car car3=new DazhongFactory().getCar();

        car1.name();
        car2.name();
        car3.name();
    }
}
