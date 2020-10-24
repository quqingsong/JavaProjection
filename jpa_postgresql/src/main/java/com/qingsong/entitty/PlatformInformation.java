package com.qingsong.entitty;

import javax.persistence.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/25 21:35
 *
 * platform_information表存储的是平台的静态信息，主键是platform_id
 */
@Entity
@Table(name = "platform_information")
public class PlatformInformation {
    //本表编号，主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //平台编号，主键
    private Integer platform_id;

    //平台名称
    @Column
    private String platform_name;

    //平台默认经度（精度0.000001）
    @Column
    private String platform_default_longitude;

    //平台默认纬度（精度0.000001）
    @Column
    private String platform_default_latitude;

    //平台服务范围（单位km）
    @Column
    private String platform_service_range;

    //平台信息备注PlatformInformation
    @Column
    private String platform_remark;

}
