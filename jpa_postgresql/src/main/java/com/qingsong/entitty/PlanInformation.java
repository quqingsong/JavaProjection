package com.qingsong.entitty;

/**
 * @Auther: 屈青松
 * @Date: 2019/5/8 20:09
 */

import javax.persistence.*;

@Entity
@Table(name = "plan_information")
public class PlanInformation {

    //本表主键，申请单号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String applicationsid;

    //申请时间
    @Column
    private String applications_time;

    //申请人姓名
    @Column
    private String applications_user_name;

    //申请人类型
    @Column
    private String applicationsusertype;
    //事件类型（1：海上搜救2：应急救援通信3：海洋防灾减灾），可扩展
    @Column
    private String applications_type;

    //事件描述
    @Column
    private String issue_descriptions;

    //申请的保障级别（1：一级响应2：二级响应3：三级响应4：四级响应）
    @Column
    private String application_levels;

    //保障地点纬度
    @Column
    private String application_latitudes;

    //保障地点经度
    @Column
    private String application_longitudes;

    //保障范围，单位KM
    @Column
    private String application_ranges;

    //保障开始时间
    @Column
    private String issue_start_times;

    //保障结束时间
    @Column
    private String issue_end_times;

    //使用人信息
    @Column
    private String issue_infomations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplicationsid() {
        return applicationsid;
    }

    public void setApplicationsid(String applicationsid) {
        this.applicationsid = applicationsid;
    }

    public String getApplications_time() {
        return applications_time;
    }

    public void setApplications_time(String applications_time) {
        this.applications_time = applications_time;
    }

    public String getApplications_user_name() {
        return applications_user_name;
    }

    public void setApplications_user_name(String applications_user_name) {
        this.applications_user_name = applications_user_name;
    }

    public String getApplicationsusertype() {
        return applicationsusertype;
    }

    public void setApplicationsusertype(String applicationsusertype) {
        this.applicationsusertype = applicationsusertype;
    }

    public String getApplications_type() {
        return applications_type;
    }

    public void setApplications_type(String applications_type) {
        this.applications_type = applications_type;
    }

    public String getIssue_descriptions() {
        return issue_descriptions;
    }

    public void setIssue_descriptions(String issue_descriptions) {
        this.issue_descriptions = issue_descriptions;
    }

    public String getApplication_levels() {
        return application_levels;
    }

    public void setApplication_levels(String application_levels) {
        this.application_levels = application_levels;
    }

    public String getApplication_latitudes() {
        return application_latitudes;
    }

    public void setApplication_latitudes(String application_latitudes) {
        this.application_latitudes = application_latitudes;
    }

    public String getApplication_longitudes() {
        return application_longitudes;
    }

    public void setApplication_longitudes(String application_longitudes) {
        this.application_longitudes = application_longitudes;
    }

    public String getApplication_ranges() {
        return application_ranges;
    }

    public void setApplication_ranges(String application_ranges) {
        this.application_ranges = application_ranges;
    }

    public String getIssue_start_times() {
        return issue_start_times;
    }

    public void setIssue_start_times(String issue_start_times) {
        this.issue_start_times = issue_start_times;
    }

    public String getIssue_end_times() {
        return issue_end_times;
    }

    public void setIssue_end_times(String issue_end_times) {
        this.issue_end_times = issue_end_times;
    }

    public String getIssue_infomations() {
        return issue_infomations;
    }

    public void setIssue_infomations(String issue_infomations) {
        this.issue_infomations = issue_infomations;
    }
}
