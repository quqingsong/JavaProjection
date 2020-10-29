package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 23:59
 * @Email:1021237024@qq.com
 */

public class HuaWeiFactory implements AbstractFactory {
    public IphoneProduct iphoneProduct() {
        return new HuaWeiphine();
    }

    public IrouteProduct irouteProduct() {
        return new HuaWeiRouter();
    }
}
