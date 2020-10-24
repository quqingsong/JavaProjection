package com.qingsong.entitty;

import javax.persistence.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/25 21:35
 *
 * application_information表存储的是应急资源申请，以application_id为主键
 */
@Entity
@Table(name = "application_information")
public class ApplicationInformation {
    //本表主键，预案编号

    //本表主键，申请单号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column
    private String applicationid;

    //申请时间
    @Column
    private String application_time;

    //申请人姓名
    @Column
    private String application_user_name;

    //申请人类型
    @Column
    private String applicationusertype;

    //事件类型（1：海上搜救2：应急救援通信3：海洋防灾减灾），可扩展
    @Column
    private String application_type;

    //事件描述
    @Column
    private String issue_description;

    //申请的保障级别（1：一级响应2：二级响应3：三级响应4：四级响应）
    @Column
    private String application_level;

    //保障地点纬度
    @Column
    private String application_latitude;

    //保障地点经度
    @Column
    private String application_longitude;

    //保障范围，单位KM
    @Column
    private String application_range;

    //保障开始时间
    @Column
    private String issue_start_time;

    //保障结束时间
    @Column
    private String issue_end_time;

    //使用人信息
    @Column
    private String issue_infomation;

    //申请状态（0：未处理1：已处理）
    @Column
    private String application_status;

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplication_time() {
        return application_time;
    }

    public void setApplication_time(String application_time) {
        this.application_time = application_time;
    }

    public String getApplication_user_name() {
        return application_user_name;
    }

    public void setApplication_user_name(String application_user_name) {
        this.application_user_name = application_user_name;
    }

    public String getApplicationusertype() {
        return applicationusertype;
    }

    public void setApplicationusertype(String applicationusertype) {
        this.applicationusertype = applicationusertype;
    }

    public String getApplication_type() {
        return application_type;
    }

    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }

    public String getIssue_description() {
        return issue_description;
    }

    public void setIssue_description(String issue_description) {
        this.issue_description = issue_description;
    }

    public String getApplication_level() {
        return application_level;
    }

    public void setApplication_level(String application_level) {
        this.application_level = application_level;
    }

    public String getApplication_latitude() {
        return application_latitude;
    }

    public void setApplication_latitude(String application_latitude) {
        this.application_latitude = application_latitude;
    }

    public String getApplication_longitude() {
        return application_longitude;
    }

    public void setApplication_longitude(String application_longitude) {
        this.application_longitude = application_longitude;
    }

    public String getApplication_range() {
        return application_range;
    }

    public void setApplication_range(String application_range) {
        this.application_range = application_range;
    }

    public String getIssue_start_time() {
        return issue_start_time;
    }

    public void setIssue_start_time(String issue_start_time) {
        this.issue_start_time = issue_start_time;
    }

    public String getIssue_end_time() {
        return issue_end_time;
    }

    public void setIssue_end_time(String issue_end_time) {
        this.issue_end_time = issue_end_time;
    }

    public String getIssue_infomation() {
        return issue_infomation;
    }

    public void setIssue_infomation(String issue_infomation) {
        this.issue_infomation = issue_infomation;
    }

    public String getApplication_status() {
        return application_status;
    }

    public void setApplication_status(String application_status) {
        this.application_status = application_status;
    }
}
