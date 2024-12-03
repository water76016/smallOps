package com.daixiaoyu.alarmsystem.logger.service.impl;

import com.daixiaoyu.alarmsystem.config.MongoConfig;
import com.daixiaoyu.alarmsystem.logger.LoggerInfo;
import com.daixiaoyu.alarmsystem.logger.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * 1.AbstractTestNGSpringContextTests,保证注入的loggerService不为空
 * 2.@SpringBootApplication(scanBasePackageClasses = MongoConfig.class)
 * 保证能够访问到配置，不然会报错找不到mongodb的那个服务类
 */
@SpringBootTest(classes = LoggerServiceImpl.class)
@SpringBootApplication(scanBasePackageClasses = MongoConfig.class)
public class LoggerServiceImplTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private LoggerService loggerService;

    @Test
    public void testAddLoggerInfo() {
        LoggerInfo loggerInfo = new LoggerInfo();
        loggerInfo.setName("测试");
        loggerInfo.setMessage("我报错了");
        loggerInfo.setCreateTime(new Date());
        loggerService.addLoggerInfo(loggerInfo);

    }
}