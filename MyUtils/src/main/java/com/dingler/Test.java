package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/12/3
 * @Content:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    // 获取网页源码
    static String httpGet(String url) {

        StringBuffer buffer = new StringBuffer();

        try {

            URLConnection conn = new URL(url).openConnection();
            InputStream inputStream;
            conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");

            inputStream = conn.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(streamReader);

                String line = null;

                while ((line = reader.readLine()) != null) {
                    buffer.append(line).append(" ");
                }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }

    public static void main(String[] args) {

        String html = httpGet("https://www.baidu.com/s?wd=ip");

        // 提出IP

        Pattern pattern = Pattern.compile("<span\\sclass=\"c-gap-right\">本机IP:&nbsp;([^<]+)</span>");

        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {

            String ip = matcher.group(1);

            System.out.println(ip);
        }

    }
}