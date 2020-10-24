package com.dingler.mapper;

import com.dingler.pojo.HGM_Data;
import com.dingler.pojo.Monitor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 屈青松
 * @date 2020/7/28 10:23
 */

@Mapper
@Repository
public interface MonitorMapper {
    //获取所有数据
    List<Monitor> getMonitorDataList();

}
