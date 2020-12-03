package com.dingler.ip;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/12/3
 * @Content:
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 系统工具类，用于获取系统相关信息
 * Created by kagome.
 */
public class CustomSystemUtil {
    public static String INTRANET_IP = getIntranetIp(); // 内网IP
    public static String INTERNET_IP = getV4IP(); // 外网IP

    private CustomSystemUtil(){}

    /**
     * 获得内网IP
     * @return 内网IP
     */
    private static String getIntranetIp(){
        try{
            return InetAddress.getLocalHost().getHostAddress();
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 获得外网IP
     * @return 外网IP
     */
    public static String getV4IP() {
        String ip = "";
        String chinaz = "http://ip.chinaz.com/";

        String inputLine = "";
        String read = "";
        try {
            URL url = new URL(chinaz);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            while ((read = in.readLine()) != null) {
                inputLine += read;
            }
            System.out.println(inputLine);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Pattern p = Pattern.compile("\\<strong class\\=\"red\">(.*?)\\<\\/strong>");
        Matcher m = p.matcher(inputLine);
        if(m.find()){
            String ipstr = m.group(1);
            System.out.println(ipstr);
        }
        return ip;
    }
}