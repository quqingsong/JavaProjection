package com.dingler.entity;

/**
 * @author 屈青松
 * @date 2020/8/20 15:23
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


//@Document 文档对象 （索引信息、文档类型)
@Data
@Document(indexName = "iot_data",type = "sensor_data")
//@Repository
public class SumengModel {
        @Id
        //在swagger-ui.html#页面中如果返回User，ModelModel Schema选项卡可见，包括如入参和出参
        @ApiModelProperty(value = "id编号")
        private long id;
        //模式
        @ApiModelProperty(value = "传感器编号")
        private String sensorNumber;

        @ApiModelProperty(value = "指标编号")
        private String indicatorCode;

        @ApiModelProperty(value = "指标名称")
        private String indicatorName;

        @ApiModelProperty(value = "数值")
        private String value;

        @ApiModelProperty(value = "标志")
        private String flag;

        //时间戳
        @ApiModelProperty(value = "创建时间")
        private String createTime;


    }
