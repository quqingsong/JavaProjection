package com.dingler.method1;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:真正的适配器，要连接网线，连接USB。
 */
public class Adapter extends Cable implements NetToUsb{

    public void handRequest() {
        //调用父类方法，可以上网了。
        super.request();
    }
}
