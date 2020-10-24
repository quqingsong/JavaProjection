package com.qingsong.entitty;

import javax.persistence.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/25 21:35
 *
 * device_information表存储的是设备的静态信息，主键是platform_id和device_id组成的联合主键
 */
@Entity
@Table(name = "log_information")
public class LogInformation {
    //本表编号，主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //平台编号，主键，所属平台
    //本表主键
    private Integer id;

    //日志ip
    @Column
    private String ip;

    //用户id
    @Column
    private String usernumber;

    //登录时间
    @Column
    private String logtime;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }

}
