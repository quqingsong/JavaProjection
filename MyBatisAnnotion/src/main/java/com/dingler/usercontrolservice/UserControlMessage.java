package com.dingler.usercontrolservice;


import com.alibaba.fastjson.JSONObject;
import com.dingler.entity.entityVo.UserMessageVo;

import java.util.List;

/**
 * @author 屈青松
 * @date 2020/9/22 17:59
 */
public interface UserControlMessage {
    //保存用户数据
    void saveMessage(String currentdate, String userip, String deviceip, int deviceport, String river, String deviceplace
            , String username, String devicename, String controlmessage, String feedbackmessage);
    //查询用户数据
    List<UserMessageVo> selectMessage();
    //查询河道
    JSONObject inqueryriver(String beforedate, String afterdate, String rivername, int currentpage, int pagesize);
//    //查询页面数量
//    int inquerypagecount(String beforedate, String afterdate);
}
