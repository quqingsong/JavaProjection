package com.qingsong.controller;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.LogInformation;
import com.qingsong.repository.LogInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/5/28 16:24
 */
@RestController
public class LogInformationController {

    @Autowired
    LogInformationRepository logInformationRepository;

    //申请日志
    @GetMapping("/savelog")
    public LogInformation insertLogInformation(@RequestParam("ip") String ip,@RequestParam("usernumber") String usernumber,@RequestParam("logtime") String logtime){
        LogInformation logInformation=new LogInformation();
        logInformation.setIp(ip);
        logInformation.setUsernumber(usernumber);
        logInformation.setLogtime(logtime);
        logInformationRepository.save(logInformation);
        return  logInformation;
    }

    //查询所有申请信息
    @GetMapping("/querylog")
    private List<LogInformation> getAppInformation(){
        List<LogInformation> logInformations=logInformationRepository.findAll();
        return  logInformations;
    }
}
