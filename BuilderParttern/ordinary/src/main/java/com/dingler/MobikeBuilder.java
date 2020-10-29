package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content: ConcreteBuilder 类
 */

// 具体 builder 类
public class MobikeBuilder extends Builder{
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame("Mobike设置结构");
    }
    @Override
    void buildSeat() {
        mBike.setSeat("Mobike设置座椅");
    }
    @Override
    void buildTire() {
        mBike.setTire("Mobike设置轮胎");
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}

