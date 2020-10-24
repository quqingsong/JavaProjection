package com.qingsong.entitty;

import javax.persistence.*;

/**
 * @Auther: qingsong
 * @Date: 2019/3/7 10:55
 * 用户注册登录信息
 */

//使用jpa注解配置映射关系
@Entity//告诉 jpa这是一个实体类(和数据表映射的类)
@Table(name = "Tuser")//默认创建数据表
public class User {
    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增组建
    private Integer id;
    @Column
    private String userType;
    //(name = "last_name",length = 50)
    @Column
    private String userid;
    @Column//这是和数据表对应的一个列
    private String name;
    @Column//省略默认列名就是属性名
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
