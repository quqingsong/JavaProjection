package com.qingsong.entitty;

import javax.persistence.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/25 21:35
 *
 * device_information表存储的是设备的静态信息，主键是platform_id和device_id组成的联合主键
 */
@Entity
@Table(name = "device_information")
public class DeviceInformation {
    //本表编号，主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //平台编号，主键，所属平台
    //本表主键
    private Integer device_id;

    //本表外键
    @Column
    private String platform_id;

    //设备名称
    @Column
    private String devicename;

    //通信范围
    @Column
    private String device_range;

    //设备数量
    @Column
    private String device_count;

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public String getPlatform_id() {
        return platform_id;
    }

    public void setPlatform_id(String platform_id) {
        this.platform_id = platform_id;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevice_range() {
        return device_range;
    }

    public void setDevice_range(String device_range) {
        this.device_range = device_range;
    }

    public String getDevice_count() {
        return device_count;
    }

    public void setDevice_count(String device_count) {
        this.device_count = device_count;
    }
}
