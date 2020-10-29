package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:
 */

public class OfoBuilder extends Builder{
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame("ofo设置框架");
    }
    @Override
    void buildSeat() {
        mBike.setSeat("ofo设置座椅");
    }
    @Override
    void buildTire() {
        mBike.setTire("ofo设置轮胎");
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}