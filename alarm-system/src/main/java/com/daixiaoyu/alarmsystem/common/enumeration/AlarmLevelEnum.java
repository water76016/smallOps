package com.daixiaoyu.alarmsystem.common.enumeration;

/**
 * @program: alarm-system
 * @author: water76016
 * @description: 告警等级枚举类
 * @version: v1.0.0
 * @create: 2024-02-03 13:58
 **/
public enum AlarmLevelEnum {
    URGENT("URGENT", "紧急"),
    SERIOUS("SERIOUS", "严重");

    private String code;
    private String name;

    AlarmLevelEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
