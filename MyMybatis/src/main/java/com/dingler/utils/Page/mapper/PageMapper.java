package com.dingler.utils.Page.mapper;

import com.dingler.pojo.HGM_Data;
import com.dingler.utils.Page.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 屈青松
 * @date 2020/7/29 11:35
 *
 * 分页查询接口
 */

@Mapper
@Repository
public interface PageMapper {
    //分页查询方法一
    public List<HGM_Data> selectForPage1(int startIndex, int pageSize);
    //分页查询方法二
    public List<HGM_Data> selectForPage2(Map<String, Object> map);
    //选择当页显示数据数量
    public Integer selectCount();
    //选择。。。
    public List<HGM_Data> selectForPage3(PageBean pageBean);

    //分页加模糊查询
    public Integer selectCount2(String keywords);
    //选择。。。
    public List<HGM_Data> selectForPage4(Map<String, Object> map);
}