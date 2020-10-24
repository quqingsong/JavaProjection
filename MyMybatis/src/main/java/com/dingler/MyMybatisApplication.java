package com.dingler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.dingler.mapper")
public class MyMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMybatisApplication.class, args);
	}

}
