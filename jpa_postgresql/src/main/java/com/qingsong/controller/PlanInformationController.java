package com.qingsong.controller;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.PlanInformation;
import com.qingsong.repository.PlanInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/5/8 20:21
 */
@RestController
public class PlanInformationController {
    @Autowired
    PlanInformationRepository planInformationRepository;

    //申请信息
    @GetMapping("/deliverplan")
    public PlanInformation insertPlanInformation(@RequestParam("textView_number_result") String textView_number_result,
                                                    @RequestParam("textView_data_result") String textView_data_result,
                                                    @RequestParam("textView_person_result") String textView_person_result,
                                                 @RequestParam("usertype") String usertype,
                                                 @RequestParam("eventType_result") String eventType_result,
                                                    @RequestParam("description_result") String description_result,
                                                    @RequestParam("protectRank_result") String rotectRank_result,
                                                    @RequestParam("editText_h") String editText_h,
                                                    @RequestParam("editText_hh") String editText_hh,
                                                    @RequestParam("range_result") String range_result,
                                                    @RequestParam("textView_startData_result") String textView_startData_result,
                                                    @RequestParam("textView_endData_result") String textView_endData_result,
                                                    @RequestParam("spinner_userMessage_result") String spinner_userMessage_result
    ){
        PlanInformation planInformation=new PlanInformation();
        planInformation.setApplicationsid(textView_number_result);
        planInformation.setApplications_time(textView_data_result);
        planInformation.setApplications_user_name(textView_person_result);
        planInformation.setApplicationsusertype(usertype);
        planInformation.setApplications_type(eventType_result);
        planInformation.setIssue_descriptions(description_result);
        planInformation.setApplication_levels(rotectRank_result);
        planInformation.setApplication_latitudes(editText_h);
        planInformation.setApplication_longitudes(editText_hh);
        planInformation.setApplication_ranges(range_result);
        planInformation.setIssue_start_times(textView_startData_result);
        planInformation.setIssue_end_times(textView_endData_result);
        planInformation.setIssue_infomations(spinner_userMessage_result);
        planInformationRepository.save(planInformation);
        return  planInformation;
    }

    //查询所有申请信息
    @GetMapping("/queryplan")
    private List<PlanInformation> getPlan(){
        List<PlanInformation> planInformations=planInformationRepository.findAll();
        return  planInformations;
    }
    //查询调度员类型
    @GetMapping("/queryplantype")
    private List<PlanInformation> getPlantype(@RequestParam("usertype") String usertype){
        List<PlanInformation> planInformations=planInformationRepository.findByApplicationsusertype(usertype);
        return planInformations;
    }
}
