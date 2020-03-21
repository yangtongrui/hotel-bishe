package com.gp.bishe.dao;

import com.gp.bishe.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/* @Mapper注解是Mybatis框架用的，标记为映射器
@Repository注解是Spring框架用的，标记为一个Bean*/
@Mapper
@Repository
public interface UserMapper {
   List<User> getUserList();

    User login( String username);

    User findUserById(String userId);

    User selectByName(String username);

    void insertUser(User user);
}
