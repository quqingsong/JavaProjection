package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/12/15
 * @Content:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MyCmd {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();    //获取开始时间
        System.out.println("开始");
        String commandStr = "ping 60.171.250.93";
        MyCmd.exeCmd(commandStr);
        String commandStr1 = "ping 60.175.202.136";
        MyCmd.exeCmd(commandStr1);
//        String commandStr12 = "ping 60.171.216.7";
//        MyCmd.exeCmd(commandStr12);
        System.out.println("结束");
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }

    public static void exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            //执行cmd命令
            Process p = Runtime.getRuntime().exec(commandStr);
            //返回值是流，以便读取。
            br = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("GBK")));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

