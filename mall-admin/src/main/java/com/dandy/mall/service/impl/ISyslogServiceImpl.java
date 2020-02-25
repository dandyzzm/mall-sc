package com.dandy.mall.service.impl;

import com.dandy.mall.dao.SyslogMapper;
import com.dandy.mall.model.Syslog;
import com.dandy.mall.service.ISyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ISyslogServiceImpl
 * @Description: TODO
 * @Author: Dandy
 * @Date: 2020/2/18 13:27
 * @Version: 1.0
 **/
@Service("iSyslogService")
public class ISyslogServiceImpl implements ISyslogService {

    @Autowired
    SyslogMapper syslogMapper;

    @Override
    public Integer add(Syslog syslog) {
        return syslogMapper.insert(syslog);
    }
}
