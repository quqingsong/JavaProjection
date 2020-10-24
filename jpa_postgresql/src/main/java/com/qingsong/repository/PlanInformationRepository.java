package com.qingsong.repository;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.PlanInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Auther: 屈青松
 * @Date: 2019/5/8 20:15
 */
public interface PlanInformationRepository extends JpaRepository<PlanInformation, Integer>, Repository<PlanInformation,Integer> {

    //查询调度员类型
    public List<PlanInformation> findByApplicationsusertype(String userplantype);

}
