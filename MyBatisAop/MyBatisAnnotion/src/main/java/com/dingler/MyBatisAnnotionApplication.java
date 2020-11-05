package com.dingler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这句话非常关键
@SpringBootApplication
public class MyBatisAnnotionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisAnnotionApplication.class, args);
    }


//	@RequestMapping
//	public String hello() {
//		return "hello spring boot!";
//	}

}
