package com.dingler.entity.entityDto;

import lombok.Data;

/**
 * @author 屈青松
 * @date 2020/9/23 10:03
 * post请求参数，在Body中
 */
@Data
public class UserMessageDto {

    //时间
    private String beforedate;
    //时间
    private String afterdate;
    //河道
    private String rivername;
    //当前页
    private int currentpage;
    //页面大小
    private int pagesize;


}
