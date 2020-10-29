package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/26 0:00
 * @Email:1021237024@qq.com
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("小米产品");

        XiaomiFactory xiaomiFactory=new XiaomiFactory();

        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IrouteProduct irouteProduct = xiaomiFactory.irouteProduct();
        irouteProduct.openwifi();
        irouteProduct.setting();

    }
}
