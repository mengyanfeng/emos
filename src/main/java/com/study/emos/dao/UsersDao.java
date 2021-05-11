package com.study.emos.dao;

import com.study.emos.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}