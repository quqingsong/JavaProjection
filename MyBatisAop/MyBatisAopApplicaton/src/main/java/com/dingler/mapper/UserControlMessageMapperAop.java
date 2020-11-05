package com.dingler.mapper;


import com.dingler.entity.entityVo.UserMessageVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 屈青松
 * @date 2020/9/22 17:59
 */
@Mapper
@Repository
public interface UserControlMessageMapperAop {
    //保存用户数据
    void saveMessage(String currentdate, String userip, String deviceip, int deviceport, String river,
                     String deviceplace, String username, String devicename, String controlmessage, String feedbackmessage);
    //查询用户数据
    List<UserMessageVo> selectMessage();
    //查询指定河道数据
    List<UserMessageVo> inquerydevicelog(Map<String, Object> map);

    int inquerypagecount(Map<String, Object> map);

}
