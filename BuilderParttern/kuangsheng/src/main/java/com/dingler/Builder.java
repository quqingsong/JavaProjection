package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:抽象的建造者：方法，抽象类
 */
public abstract class Builder {
    //地基
    abstract void buildA();
    //钢筋工程
    abstract void buildB();
    //铺电线
    abstract void buildC();
    //粉刷
    abstract void buildD();
    //完工，得到产品
    abstract Product getproduct();
}
