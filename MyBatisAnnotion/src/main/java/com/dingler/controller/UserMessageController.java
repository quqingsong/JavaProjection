package com.dingler.controller;

/**
 * @author 屈青松
 * @date 2020/9/23 11:09
 *
 * 这是一个数据库存取测试接口
 */

import com.alibaba.fastjson.JSONObject;
import com.dingler.entity.entityDto.UserMessageDto;
import com.dingler.entity.entityVo.UserMessageVo;
import com.dingler.usercontrolservice.UserControlMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "远程通信控制用户信息   屈青松")
@RestController
@Slf4j
public class UserMessageController {

    @Autowired
    private UserControlMessage userControlMessage;

    @GetMapping("/controlmessage")
    public String saveuserMessage(){
        userControlMessage.saveMessage("currentdate","userip","gateHost",1,"river","deviceplace","username","devicename",
                "devicepausemessage","feedbackmessage");
        log.info("存取成功！");
        return "存取成功！";
    }

    @GetMapping("/inquiremessage")
    public List<UserMessageVo> inquireuserMessage(){
       return userControlMessage.selectMessage();
    }


    @ApiOperation(value = "用户日志", notes = "输入设备名")
    //复杂请求参数使用这种方法
    @RequestMapping(value = "inquerydevicelog", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public JSONObject inquireuserdate(@RequestBody UserMessageDto userMessageDto){
        return userControlMessage.inqueryriver(userMessageDto.getBeforedate(),userMessageDto.getAfterdate(),userMessageDto.getRivername(),userMessageDto.getCurrentpage(),userMessageDto.getPagesize());
    }


}
