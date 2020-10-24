package com.qingsong.repository;

import com.qingsong.entitty.DeviceInformation;
import com.qingsong.entitty.TaskInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/4/3 16:20
 */
public interface TaskInformationRepository extends JpaRepository<TaskInformation, Integer>, Repository<TaskInformation,Integer> {
    //查询id
    public List<TaskInformation> findByApplyid(String applyid);

    //查询平台
    public List<TaskInformation> findByPlatformid(String platformid);

//    @Modifying
//    @Query(value = "update TaskInformation set taskstate=?2 where task_id=?1",nativeQuery=true)
//    public List<TaskInformation> updatetaskstate(@RequestParam("id") Integer id, @RequestParam("tastate") String tastate);
    //原生SQL实现更新方法接口
//    @Query(value = "update from TaskInformation set taskstate=?1 where tas=?2 ", nativeQuery = true)
//    @Modifying
//    public void updateOne(String name,int id);
/*    //删除
    public List<TaskInformation>deleteByAndApplyid(String applyid);*/

}

