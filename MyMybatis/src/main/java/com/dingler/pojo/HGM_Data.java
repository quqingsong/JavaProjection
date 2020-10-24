package com.dingler.pojo;

//import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 屈青松
 * @date 2020/7/27 11:51
 */
//实体类
@Data                                       //包含set,get,toString方法
@NoArgsConstructor                          //无参构造函数
@AllArgsConstructor                         //有参构造函数
public class HGM_Data {


    private int id;

    //设备码
    private String devicecode;

    //PointCode
    private String pointcode;

    //PointValu
    private float pointvalue;

    //Create_Time
    private String createtime;


//    @Override
//    public String toString() {
//        return "HGM_Data{" +
//                "id=" + id +
//                ", devicecode='" + devicecode + '\'' +
//                ", pointcode='" + pointcode + '\'' +
//                ", pointvalue=" + pointvalue +
//                ", createtime='" + createtime + '\'' +
//                '}';
//    }
}