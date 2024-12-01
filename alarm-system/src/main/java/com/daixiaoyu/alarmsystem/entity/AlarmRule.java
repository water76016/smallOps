package com.daixiaoyu.alarmsystem.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 14:59
 **/
@Data
public class AlarmRule implements Serializable {
    private String uniqueId;
    private String name;
    private String resourceType;
    private String indicatorCode;
    private String value;
    private Date createTime;
    private Date modifyTime;
}
