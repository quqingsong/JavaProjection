package com.qingsong.controller;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.DeviceInformation;
import com.qingsong.entitty.User;
import com.qingsong.repository.ApplicationInformationRepository;
import com.qingsong.repository.DeviceInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/4/3 14:59
 */
@RestController
public class deviceInformationController {

    @Autowired
    DeviceInformationRepository deviceInformationRepository;

  /*//将设备信息写入数据库中
   @GetMapping("/deliverdevice")
    public DeviceInformation insertDevice(@RequestParam("platform_id") String platform_id, @RequestParam("devicename") String devicename, @RequestParam("device_range") String device_range, @RequestParam("device_count") String device_count){
        DeviceInformation deviceInformation=new DeviceInformation();
        deviceInformation.setPlatform_id(platform_id);
        deviceInformation.setDevicename(devicename);
        deviceInformation.setDevice_range(device_range);
        deviceInformation.setDevice_count(device_count);
        return deviceInformation;
    }
    */
    //查询所有申请信息
    @GetMapping("/querydevice")
    private List<DeviceInformation> getDeviceInformation(){
        List<DeviceInformation> deviceInformations=deviceInformationRepository.findAll();
        return  deviceInformations;
    }

    //查询当前用户
    @GetMapping("/queryname")
    private List<DeviceInformation> getOneDeciceInformation(@RequestParam("devicename") String devicename){
        List<DeviceInformation> deviceInformations=deviceInformationRepository.findByDevicename(devicename);
        return  deviceInformations;
    }

}
