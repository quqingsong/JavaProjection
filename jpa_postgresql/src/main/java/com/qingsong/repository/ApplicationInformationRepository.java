package com.qingsong.repository;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.TaskInformation;
import com.qingsong.entitty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Auther: qingsong
 * @Date: 2019/3/26 16:02
 */
public interface ApplicationInformationRepository extends JpaRepository<ApplicationInformation, Integer> , Repository<ApplicationInformation,Integer> {

    // @Query("select * from tuser where t.userid= ?1 and t.password=?2",nativeQuery = true)
    @Query(value = "select * from application_information1 where application_user_name=?1", nativeQuery = true)
    List<ApplicationInformation> getOneInformation(String application_user_name);


    @Query("from ApplicationInformation where application_user_name=?1")
    List<ApplicationInformation> getOneInformation2(String application_user_name);


    //查询id
    public List<ApplicationInformation> findById(Integer id);

    //查询调度员类型
    public List<ApplicationInformation> findByApplicationusertype(String applicationusertype);


    //删除,这一局注释非常重要
    @Transactional
    public List<ApplicationInformation>deleteByApplicationid(String applyid);


}
