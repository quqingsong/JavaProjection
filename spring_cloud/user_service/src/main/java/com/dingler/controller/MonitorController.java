package com.dingler.controller;
/*
 * @author  qingsong
 * @date  2020/9/13 17:59
 * @Email:1021237024@qq.com
 */

import com.dingler.mapper.MonitorMapper;
import com.dingler.pojo.Monitor;
import com.dingler.service.QueryMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonitorController {


    @Autowired
    private QueryMonitor queryMonitor;

    @GetMapping("/moniorlist")
    public List<Monitor> findMonitorList(){
        return queryMonitor.getMonitorDataListService();
    }

}
