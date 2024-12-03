package com.daixiaoyu.alarmsystem.domain;

import lombok.Data;

import java.util.Date;
import java.util.Map;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 14:53
 **/
@Data
public class IndicatorMessage {
    private String id;
    private String resourceType;
    private String resourceCode;
    private Map<String, Object> indicator;
    private Date date;
}
