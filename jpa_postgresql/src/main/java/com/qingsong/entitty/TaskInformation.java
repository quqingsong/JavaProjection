package com.qingsong.entitty;

import javax.persistence.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/25 21:49
 *
 * task_information表存储的是规划预案中的具体任务，主键为task_id，外键为plan_information表的plan_id
 */
@Entity
@Table(name = "task_information")
public class TaskInformation {
    //任务标号，本表主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer task_id;

    //本任务从属的预案编号
    @Column
    private String applyid;

    //所用平台编号
    @Column
    private String platformid;

    //所用设备编号
    @Column
    private String device_id;

    //任务开始时间
    @Column
    private String task_start_time;

    //任务经度
    @Column
    private String task_longitude;

    //任务纬度
    @Column
    private String task_latitude;

    //任务结束时间
    @Column
    private String task_end_time;

    //任务结束时间
    @Column
    private String taskstate;

    public String getTaskstate() {
        return taskstate;
    }

    public void setTaskstate(String taskstate) {
        this.taskstate = taskstate;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getApplyid() {
        return applyid;
    }

    public void setApplyid(String applyid) {
        this.applyid = applyid;
    }

    public String getPlatformid() {
        return platformid;
    }

    public void setPlatformid(String platformid) {
        this.platformid = platformid;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getTask_start_time() {
        return task_start_time;
    }

    public void setTask_start_time(String task_start_time) {
        this.task_start_time = task_start_time;
    }

    public String getTask_longitude() {
        return task_longitude;
    }

    public void setTask_longitude(String task_longitude) {
        this.task_longitude = task_longitude;
    }

    public String getTask_latitude() {
        return task_latitude;
    }

    public void setTask_latitude(String task_latitude) {
        this.task_latitude = task_latitude;
    }

    public String getTask_end_time() {
        return task_end_time;
    }

    public void setTask_end_time(String task_end_time) {
        this.task_end_time = task_end_time;
    }
}
