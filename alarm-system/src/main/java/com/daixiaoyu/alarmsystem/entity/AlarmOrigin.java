package com.daixiaoyu.alarmsystem.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 14:54
 **/
@Data
public class AlarmOrigin {
    private Integer id;
    private String uniqueId;
    private String resourceType;
    private String resourceCode;
    private String indicatorCode;
    private String description;
    private String alarmStatus;
    private String alarmLevel;
    private String sourceSystem;
    private Date triggerTime;
    private Date latestTime;
    private Date recoveryTime;
    private Date createTime;
    private Date modifyTime;
}
