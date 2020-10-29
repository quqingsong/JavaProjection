package com.dinngler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:
 */
public abstract class Computer {

    //组合，品牌
    protected  Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        //自带品牌
        brand.info();
    }
}
