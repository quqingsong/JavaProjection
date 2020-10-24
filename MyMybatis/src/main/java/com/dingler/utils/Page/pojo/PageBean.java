package com.dingler.utils.Page.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 屈青松
 * @date 2020/7/29 11:31
 *
 * PageBean     分页查询工具
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    //当前页
    private Integer currentPage;
    //开始索引
    private Integer startIndex;
    //page大小
    private Integer pageSize=5;
    //数据总数
    private Integer totalCount;
    //总页数
    private Integer totalPage;
}