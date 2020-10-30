package com.dingler.method2;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:真正的适配器，要连接网线，连接USB。
 */
public class Adapter implements NetToUsb {
    private Cable cable;

    public Adapter(Cable cable) {
        this.cable = cable;
    }

    public void handRequest() {
        //调用父类方法，可以上网了。
        cable.request();
    }
}
