package com.qingsong.repository;

import com.qingsong.entitty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Auther: qingsong
 * @Date: 2019/3/7 11:13
 */

//继承JpaRepository来完成数据库的操作
public interface UserRepository extends JpaRepository<User,Integer>,Repository<User,Integer>{

 //  public List<User> findByNameAndPassword(String name,String password);
 @Query("from User where userid=?1 and password=?2")
 List<User> queryByUseridAndPassword(String userid,String password);

// @Query("select * from tuser where t.userid= ?1 and t.password=?2",nativeQuery = true)
@Query(value = "select * from tuser where userid=?1 AND password=?2", nativeQuery = true)
List<User> selectprosess(String userid,String password);

   public List<User> findByUseridAndPassword(String userid,String password);


}
