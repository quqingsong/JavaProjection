package com.dingler.service;
/*
 * @author  qingsong
 * @date  2020/10/11 18:41
 * @Email:1021237024@qq.com
 */

import com.dingler.pojo.Monitor;

import java.util.List;

public interface QueryMonitor {
    //获取所有数据
    List<Monitor> getMonitorDataListService();
}
