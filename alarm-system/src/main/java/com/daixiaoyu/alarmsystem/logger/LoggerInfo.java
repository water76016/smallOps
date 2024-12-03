package com.daixiaoyu.alarmsystem.logger;

import lombok.Data;

import java.util.Date;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 15:13
 **/
@Data
public class LoggerInfo {
    private String name;
    private String message;
    private Date createTime;

}
