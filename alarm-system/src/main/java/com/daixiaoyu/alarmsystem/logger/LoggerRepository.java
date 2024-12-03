package com.daixiaoyu.alarmsystem.logger;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 15:13
 **/
public interface LoggerRepository extends MongoRepository<LoggerInfo, String> {
}
