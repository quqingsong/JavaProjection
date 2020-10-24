package com.dingler.service.serviceImpl;
/*
 * @author  qingsong
 * @date  2020/10/11 18:42
 * @Email:1021237024@qq.com
 */

import com.dingler.mapper.MonitorMapper;
import com.dingler.pojo.Monitor;
import com.dingler.service.QueryMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryMonitorImpl implements QueryMonitor {

    @Autowired
    private MonitorMapper monitorMapper;

    @Override
    public List<Monitor> getMonitorDataListService() {
        return monitorMapper.getMonitorDataList();
    }
}
