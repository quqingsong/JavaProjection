package com.course.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.course.service.RemoteRequetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.logging.Level;

/**
 * @author 屈青松
 * @date 2020/9/10 8:55
 */

@RestController
public class SuZHouController {

    @Autowired
    private RemoteRequetService  remoteRequetService;
    @RequestMapping(value = "/validtoken",method = RequestMethod.POST)
    public Boolean validtoken(){
        int level = 0;
        String url="http://220.179.53.40:10017/auth/validtoken/";
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("username","suzhouadmin");
        jsonObject.put("token","eyJhbGciOiJIUzI1NiIsImlhdCI6MTU5OTc4NzU0OCwiZXhwIjoxNTk5ODczOTQ4fQ.eyJpZCI6MzF9.OEdu-tcv4AWTTCyhWqFctlRB-NY_S1iO-M7oY_DT78k");
        JSONObject jsonObject1 = remoteRequetService.requestByPost(url, jsonObject, JSONObject.class, "json");
        JSONObject jsonObject2=jsonObject1.getJSONObject("data");
        JSONArray jsonArray=jsonObject2.getJSONArray("roles");
        for (int i = 0; i <jsonArray.size() ; i++) {
            JSONObject jsonObject3= (JSONObject) jsonArray.get(i);
            level= (int) jsonObject3.get("level");
            level=+level;
            System.out.println(level);
        }
        if (level>=1){
            //当前用户有访问权限。
            return true;
        }else {
            //当前用户无访问权限。
            return false;
        }
    }
}
