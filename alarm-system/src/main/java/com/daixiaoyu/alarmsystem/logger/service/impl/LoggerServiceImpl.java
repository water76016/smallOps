package com.daixiaoyu.alarmsystem.logger.service.impl;

import com.daixiaoyu.alarmsystem.logger.LoggerInfo;
import com.daixiaoyu.alarmsystem.logger.LoggerRepository;
import com.daixiaoyu.alarmsystem.logger.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 15:14
 **/
@Service
public class LoggerServiceImpl implements LoggerService {
    @Autowired
    private LoggerRepository repository;

    @Override
    public void addLoggerInfo(LoggerInfo loggerInfo) {
        repository.save(loggerInfo);
    }
}
