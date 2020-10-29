package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:Builder 类
 */

// 抽象 builder 类
public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();
}