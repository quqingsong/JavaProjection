package com.dingler;

import java.util.Date;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:这里是深拷贝
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date();

        Video video1=new Video("案例一",date);
        System.out.println("video1 = " + video1);
        System.out.println("hashcode: "+video1.hashCode());


        Video video2=(Video) video1.clone();
        video2.setMessage("案例二");
        System.out.println("video2 = " + video2);
        System.out.println("hashcode: "+video2.hashCode());

        System.out.println("===================================================");
        date.setTime(111111);
        System.out.println("video1 = " + video1);
        System.out.println("hashcode: "+video1.hashCode());


        System.out.println("video2 = " + video2);
        System.out.println("hashcode: "+video2.hashCode());
    }
}
