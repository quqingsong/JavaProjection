package com.dingler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 * @author  qingsong
 * @date  2020/9/19 21:11
 * @Email:1021237024@qq.com
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DataAopApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataAopApplication.class,args);
    }
}
