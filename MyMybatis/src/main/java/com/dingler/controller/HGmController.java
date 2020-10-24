package com.dingler.controller;

import com.dingler.mapper.HGMMapper;
import com.dingler.pojo.HGM_Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 屈青松
 * @date 2020/7/28 11:12
 */
@RestController
public class HGmController {

    @Autowired
    private HGMMapper hgmMapper;


    //查询所有信息
    @GetMapping(value = "/query")
    public List<HGM_Data> findHGM() {

        List<HGM_Data> hgm_Datas = hgmMapper.getHGMDataList();
        for (HGM_Data hgm_data:hgm_Datas){
            System.out.println(hgm_data.toString());
        }
        return hgm_Datas;
    }

    //查询所有信息
    @GetMapping(value = "/querydevice")
    public List<HGM_Data> findHGMDevice() {

        List<HGM_Data> hgm_Datas = hgmMapper.getHGMDeviceCodeList("YQJL02");

        return hgm_Datas;
    }

    //查询所有信息
    @GetMapping(value = "/queryid")
    public List<HGM_Data> findHGMId() {

        List<HGM_Data> hgm_Datas = hgmMapper.getHGMIdList(1012);

        return hgm_Datas;
    }

    //查询所有信息
    @GetMapping(value = "/querypointvalue")
    public List<HGM_Data> findHGMPointValue() {

        List<HGM_Data> hgm_Datas = hgmMapper.getHGMPointValueList(1);

        return hgm_Datas;
    }
}