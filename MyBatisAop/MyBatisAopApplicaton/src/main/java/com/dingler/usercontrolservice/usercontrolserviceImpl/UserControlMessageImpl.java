package com.dingler.usercontrolservice.usercontrolserviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dingler.entity.entityVo.UserMessageVo;
import com.dingler.mapper.UserControlMessageMapperAop;
import com.dingler.usercontrolservice.UserControlMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 屈青松
 * @date 2020/10/13 14:30
 */
@Service
public class UserControlMessageImpl implements UserControlMessage {

    @Autowired
    private UserControlMessageMapperAop userControlMessageMapperAop;

    @Override
    public void saveMessage(String currentdate, String userip, String deviceip, int deviceport, String river,
                            String deviceplace, String username, String devicename, String controlmessage, String feedbackmessage) {
        userControlMessageMapperAop.saveMessage(currentdate, userip, deviceip, deviceport, river, deviceplace, username, devicename, controlmessage, feedbackmessage);
    }
    @Override
    public List<UserMessageVo> selectMessage() {
        return userControlMessageMapperAop.selectMessage();
    }
    public JSONObject inqueryriver(String beforedate, String afterdate, String rivername, int currentpage, int pagesize) {
        Map<String, Object> mymap = new HashMap<>();
        mymap.put("beforedate", beforedate);
        mymap.put("afterdate", afterdate);
        mymap.put("rivername", rivername);
        mymap.put("currentpage", currentpage);
        mymap.put("pagesize", pagesize);

        JSONObject jsonObject = new JSONObject(new LinkedHashMap());

        Object data;
        int datacount = userControlMessageMapperAop.inquerypagecount(mymap);
        int pagecount = datacount / 20 + 1;
        jsonObject.put("datacount", datacount);
        jsonObject.put("pagecount", pagecount);
        data = (JSON.toJSON(userControlMessageMapperAop.inquerydevicelog(mymap)));
        jsonObject.put("data", data);
        return jsonObject;

    }

//    @Override
//    public int inquerypagecount() {
//        return userControlMessageMapper.inquerypagecount();
//    }


}
