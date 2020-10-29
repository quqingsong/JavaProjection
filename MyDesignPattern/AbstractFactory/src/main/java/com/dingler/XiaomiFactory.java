package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 23:56
 * @Email:1021237024@qq.com
 */

public class XiaomiFactory implements AbstractFactory {
    public IphoneProduct iphoneProduct() {
        return new Xiaomiphine();
    }

    public IrouteProduct irouteProduct() {
        return new XiaomiRouter();
    }
}
