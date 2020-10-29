package com.dingler;
/*
 * @author  qingsong
 * @date  2020/10/25 22:42
 * @Email:1021237024@qq.com
 */

public class CarFactory {
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new Wulin();
        }else if (car.equals("特斯拉")){
            return new Tesila();
        }else {
            return null;
        }
    }
}
