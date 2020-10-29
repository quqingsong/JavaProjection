package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:指挥是核心。负责指挥构建一个工程，工程如何构建，由他决定。
 */

public class Director {
    private Builder mBuilder = null;
    public Director(Builder builder) {
        mBuilder = builder;
    }
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        mBuilder.buildTire();
        return mBuilder.createBike();
    }
}