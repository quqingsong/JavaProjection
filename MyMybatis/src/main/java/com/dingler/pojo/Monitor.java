package com.dingler.pojo;
/*
 * @author  qingsong
 * @date  2020/9/7 1:29
 * @Email:1021237024@qq.com
 */

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
//链式写法
@Accessors(chain = true)
public class Monitor implements Serializable {

    private String id;

    private String code;

    private int monitor_type;

    private String name;

    private String address;

    private String createtime;
}
