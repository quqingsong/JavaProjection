package com.qingsong.repository;

import com.qingsong.entitty.ApplicationInformation;
import com.qingsong.entitty.LogInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * @Auther: 屈青松
 * @Date: 2019/5/28 17:29
 */
public interface LogInformationRepository extends JpaRepository<LogInformation, Integer>, Repository<LogInformation,Integer> {
}
