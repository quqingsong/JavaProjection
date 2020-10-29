package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:
 */
public class Worker extends Builder {
    //工人生产的产品
    private Product product;

    public Worker() {
        product = new Product();
    }

    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    Product getproduct() {
        return product;
    }
}
