package com.dingler.mapper;

import com.dingler.pojo.HGM_Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 屈青松
 * @date 2020/7/28 10:23
 */

@Mapper
@Repository
public interface HGMMapper {
    //获取所有数据
    List<HGM_Data> getHGMDataList();

    //查询设备号
    List<HGM_Data> getHGMDeviceCodeList(String divicedode);
    //查询id
    List<HGM_Data> getHGMIdList(int id);

    //查询PointValue
    List<HGM_Data> getHGMPointValueList(float PointValue);


}
