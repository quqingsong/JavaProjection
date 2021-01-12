package com.dingler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//这句话非常关键
@SpringBootApplication
public class MywebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebApplication.class, args);
    }


//	@RequestMapping
//	public String hello() {
//		return "hello spring boot!";
//	}

}
