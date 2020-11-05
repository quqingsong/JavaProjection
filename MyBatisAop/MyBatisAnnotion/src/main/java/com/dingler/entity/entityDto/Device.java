package com.dingler.entity.entityDto;

import lombok.Data;

/**
 * @author 屈青松
 * @date 2020/9/17 13:57
 */

@Data
public class Device{

    //设备访问名称
    private String devicename;
    //设备访问id
    private int deviceid;
    //设备来访状态标记，布尔型
    private Boolean devicestatus;

}