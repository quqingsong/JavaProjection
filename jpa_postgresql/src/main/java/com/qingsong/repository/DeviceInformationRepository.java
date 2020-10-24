package com.qingsong.repository;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.DeviceInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/4/3 15:02
 */
public interface DeviceInformationRepository extends JpaRepository<DeviceInformation, Integer>, Repository<DeviceInformation,Integer> {

    // @Query("select * from tuser where t.userid= ?1 and t.password=?2",nativeQuery = true)
//    @Query(value = "select * from application_information1 where application_user_name=?1", nativeQuery = true)
//    List<ApplicationInformation> getOneInformation(String application_user_name);


//    @Query("from ApplicationInformation where application_user_name=?1")
//    List<ApplicationInformation> getOneInformation2(String application_user_name);


    //查询id
    public List<DeviceInformation> findByDevicename(String devicename);

    //查询姓名（这种属性名结构比较复杂的很难成功）
//    public List<ApplicationInformation> findByApplication_user_name(String application_user_name);
}
