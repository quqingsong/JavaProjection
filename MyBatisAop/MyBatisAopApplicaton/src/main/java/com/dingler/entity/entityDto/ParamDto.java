package com.dingler.entity.entityDto;

import lombok.Data;

/**
 * @author 屈青松
 * @date 2020/9/11 9:05
 */
@Data
public class ParamDto {
    //控制信号
    private String username;
    private Integer value;
    //液位
    private Float high_value;
    private Float low_value;

    //定时
    private Float time;
}
