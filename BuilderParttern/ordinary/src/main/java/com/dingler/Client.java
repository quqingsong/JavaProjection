package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:客户端使用
 */
public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    public static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
//        System.out.println("bike.getFrame() = " + bike.getFrame());
//        System.out.println("bike.getSeat() = " + bike.getSeat());
//        System.out.println("bike.getTire() = " + bike.getTire());
        System.out.println(bike.toString());
    }
}