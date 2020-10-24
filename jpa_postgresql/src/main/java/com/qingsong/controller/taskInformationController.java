package com.qingsong.controller;

import com.qingsong.entitty.DeviceInformation;
import com.qingsong.entitty.TaskInformation;
import com.qingsong.repository.DeviceInformationRepository;
import com.qingsong.repository.TaskInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/4/3 16:19
 */
@RestController
public class taskInformationController {

    @Autowired
    TaskInformationRepository taskInformationRepository;

    //将设备信息写入数据库中
     @GetMapping("/delivertask")
      public TaskInformation insertDevice(@RequestParam("applyid") String applyid, @RequestParam("platform_id") String platform_id, @RequestParam("device_id") String device_id, @RequestParam("task_start_time") String task_start_time, @RequestParam("task_longitude") String task_longitude, @RequestParam("task_latitude") String task_latitude, @RequestParam("task_end_time") String task_end_time,@RequestParam("taskstate") String taskstate){
          TaskInformation taskInformation=new TaskInformation();
          taskInformation.setApplyid(applyid);
          taskInformation.setPlatformid(platform_id);
          taskInformation.setDevice_id(device_id);
          taskInformation.setTask_start_time(task_start_time);
          taskInformation.setTask_longitude(task_longitude);
          taskInformation.setTask_latitude(task_latitude);
          taskInformation.setTask_end_time(task_end_time);
          taskInformation.setTaskstate(taskstate);
          taskInformationRepository.save(taskInformation);
          return taskInformation;
      }

    //查询所有申请信息
    @GetMapping("/querytask")
    private List<TaskInformation> getAllTaskInformation(){
        List<TaskInformation> taskInformations=taskInformationRepository.findAll();
        return  taskInformations;
    }

    //查询当前用户
    @GetMapping("/queryapplyid")
    private List<TaskInformation> getOneTaskInformation(@RequestParam("applyid") String applyid){
        List<TaskInformation> taskInformations=taskInformationRepository.findByApplyid(applyid);
        return  taskInformations;
    }

    //查询平台
    @GetMapping("/queryplatformid")
    private List<TaskInformation> getPlatformid(@RequestParam("platformid") String platformid){
         List<TaskInformation> taskInformations=taskInformationRepository.findByPlatformid(platformid);
         return  taskInformations;
    }

//    //更新数据
//    @Transactional
//    @GetMapping("/update")
//    public List<TaskInformation> updatetask(@RequestParam("id") Integer id,@RequestParam("tastate") String tastate){
//         List<TaskInformation> taskInformations=taskInformationRepository.updatetaskstate(id,tastate);
//         return taskInformations;
//    }
/*    //根据申请id删除申请数据
    @GetMapping("/deleteapplyid")
    private List<TaskInformation> deleteOneTaskInformation(@RequestParam("applyid") String applyid){
        List<TaskInformation> taskInformations=taskInformationRepository.deleteByAndApplyid(applyid);
        return  taskInformations;
    }*/

}
