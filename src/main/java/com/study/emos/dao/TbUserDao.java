package com.study.emos.dao;

import com.study.emos.pojo.TbUser;

public interface TbUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}