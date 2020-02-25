package com.dandy.mall.portal.dao;

import com.dandy.mall.model.Syslog;

public interface SyslogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Syslog record);

    int insertSelective(Syslog record);

    Syslog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Syslog record);

    int updateByPrimaryKey(Syslog record);
}