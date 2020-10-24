package com.course.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 屈青松
 * @date 2020/9/10 10:29
 */

@RestController
public class MyController {

    @RequestMapping(value = "/mytest",method = RequestMethod.GET)
    public ModelAndView myTest(){
        return new ModelAndView( "/mysecond");
    }

    @RequestMapping(value = "/mysecond",method = RequestMethod.GET)
    public String mySecond(){
        return "这是第二个页面";
    }

    //增加数据
    @RequestMapping(value = "/method2")
    public String addyou(HttpServletRequest request){
        return "/mysecond";
    }
}
