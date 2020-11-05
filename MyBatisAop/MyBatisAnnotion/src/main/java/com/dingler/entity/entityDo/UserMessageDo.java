package com.dingler.entity.entityDo;

import lombok.Data;

/**
 * @author 屈青松
 * @date 2020/9/23 10:03
 * 对应数据库字段
 */
@Data
public class UserMessageDo {

    //时间
    private String currentdate;
    //ip地址
    private String userip;
    //设备ip
    private String deviceip;
    //设备端口
    private int deviceport;
    //河道
    private String river;
    //位置
    private String deviceplace;
    //操作用户名
    private String username;
    //设备名
    private String devicename;
    //操作信息
    private String controlmessage;
    //反馈信息
    private String feedbackmessage;


}
