package com.qingsong.controller;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.TaskInformation;
import com.qingsong.repository.ApplicationInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: qingsong
 * @Date: 2019/3/26 16:07
 */
@RestController
public class applicationInformationController {

    @Autowired
    ApplicationInformationRepository applicationInformationRepository;
    //申请信息
    @GetMapping("/deliverInformation")
    public ApplicationInformation insertInformation(@RequestParam("textView_number_result") String textView_number_result,
                                                    @RequestParam("textView_data_result") String textView_data_result,
                                                    @RequestParam("application_user_name") String application_user_name,
                                                    @RequestParam("application_user_type") String application_user_type,
                                                    @RequestParam("spinner_eventType_result") String spinner_eventType_result,
                                                    @RequestParam("spinner_description_result") String spinner_description_result,
                                                    @RequestParam("spinner_protectRank_result") String spinner_protectRank_result,
                                                    @RequestParam("editText_h") String editText_h,
                                                    @RequestParam("editText_hh") String editText_hh,
                                                    @RequestParam("editText_range_result") String editText_range_result,
                                                    @RequestParam("textView_startData_result") String textView_startData_result,
                                                    @RequestParam("textView_endData_result") String textView_endData_result,
                                                    @RequestParam("spinner_userMessage_result") String spinner_userMessage_result,
                                                    @RequestParam("spinner_status_result") String spinner_status_result
                                                   ){
        ApplicationInformation applicationInformation=new ApplicationInformation();
        applicationInformation.setApplicationid(textView_number_result);
        applicationInformation.setApplication_time(textView_data_result);
        applicationInformation.setApplication_user_name(application_user_name);
        applicationInformation.setApplicationusertype(application_user_type);
        applicationInformation.setApplication_type(spinner_eventType_result);
        applicationInformation.setIssue_description(spinner_description_result);
        applicationInformation.setApplication_level(spinner_protectRank_result);
        applicationInformation.setApplication_latitude(editText_h);
        applicationInformation.setApplication_longitude(editText_hh);
        applicationInformation.setApplication_range(editText_range_result);
        applicationInformation.setIssue_start_time(textView_startData_result);
        applicationInformation.setIssue_end_time(textView_endData_result);
        applicationInformation.setIssue_infomation(spinner_userMessage_result);
        applicationInformation.setApplication_status(spinner_status_result);
        applicationInformationRepository.save(applicationInformation);
        return  applicationInformation;
    }

    //查询所有申请信息
    @GetMapping("/queryinformation")
    private List<ApplicationInformation> getAppInformation(){
        List<ApplicationInformation> applicationInformation=applicationInformationRepository.findAll();
        return  applicationInformation;
    }
    //查询调度员类型
    @GetMapping("/applicationtype")
    private List<ApplicationInformation> getApplicationType(@RequestParam("applicationusertype") String applicationusertype){
        List<ApplicationInformation> applicationInformations=applicationInformationRepository.findByApplicationusertype(applicationusertype);
        return applicationInformations;
    }

    //查询当前用户
    @GetMapping("/queryid")
    private List<ApplicationInformation> getOneInformation(@RequestParam("id") Integer id){
        List<ApplicationInformation> applicationInformation=applicationInformationRepository.findById(id);
        return  applicationInformation;
    }
//    //查询当前用户
//    @GetMapping("/queryone1")
//    private List<ApplicationInformation> getOneInformation(@RequestParam("application_user_name") String application_user_name){
//        List<ApplicationInformation> applicationInformation=applicationInformationRepository.findByApplication_user_name(application_user_name);
//        return  applicationInformation;
//    }

    //查询当前用户
    @GetMapping("/queryone")
    private List<ApplicationInformation> getOneInformation(@RequestParam("application_user_name") String application_user_name){
        List<ApplicationInformation> applicationInformation=applicationInformationRepository.getOneInformation(application_user_name);
        return  applicationInformation;
    }

    //查询当前用户
    @GetMapping("/queryone2")
    private List<ApplicationInformation> getOneInformation2(@RequestParam("application_user_name") String application_user_name){
        List<ApplicationInformation> applicationInformation=applicationInformationRepository.getOneInformation2(application_user_name);
        return  applicationInformation;
    }

/*    //根据申请id删除申请数据
    @GetMapping("/deleteapplyid")
    private List<ApplicationInformation> deleteOneTaskInformation(@RequestParam("applyid") String applyid){
        List<ApplicationInformation> applicationInformations=applicationInformationRepository.deleteByApplicationid(applyid);
        return  applicationInformations;
    }*/

//    //根据申请id删除申请数据
//    @GetMapping("/deleteapplyid")
//    private void deleteTaskInformation(@RequestParam("applyid") String applyid){
//        List<ApplicationInformation> applicationInformations=applicationInformationRepository.deleteByApplicationid(applyid);
//    }

    //根据申请id删除申请数据
    @GetMapping("/deleteapplyid")
    private List<ApplicationInformation> deleteapplyid(@RequestParam("applyid") String applyid){
        List<ApplicationInformation> applicationInformations=applicationInformationRepository.deleteByApplicationid(applyid);
        return  applicationInformations;
    }

}
