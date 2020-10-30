package com.dingler.controller;

import com.dingler.Annotation.MyAnnotation;
import com.dingler.usercontrolservice.UserControlMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/29
 * @Content:这是一个AOP测试类
 */

@RestController
public class HelloController {

    @Autowired
    private UserControlMessage userControlMessage;

    @MyAnnotation(value = "这是日志内容")
    @GetMapping("/h")
    String Hello() {
//        userControlMessage.saveMessage("2020-10-29 10:13:01", "192.168.6.130", "127.0.0.1", 502, "三八沟", "一体化泵站", "SZBP", "1号水泵",
//                "手动关状态", "成功");
        return "操作成功";
    }
}
