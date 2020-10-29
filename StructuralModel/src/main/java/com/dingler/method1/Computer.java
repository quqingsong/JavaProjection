package com.dingler.method1;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:笔记本电脑客户端，想上网，但是连不上网线
 */
public class Computer {
    //上网具体实现
    public void net(NetToUsb netToUsb){
        //笔记本电脑想上网，找一个转接头。
        netToUsb.handRequest();
    }

    public static void main(String[] args) {

        //电脑，适配器，网线
        Computer computer=new Computer();
//        Cable cable=new Cable();
        Adapter adapter=new Adapter();

//        方式一
        computer.net(adapter);


    }
}
