package com.daixiaoyu.alarmsystem.common.enumeration;

/**
 * @program: alarm-system
 * @author: water76016
 * @description: 告警状态枚举类
 * @version: v1.0.0
 * @create: 2024-02-03 14:00
 **/
public enum AlarmStatusEnum {
    OPEN("OPEN", "未处理"),
    CLOSE("CLOSE", "已关闭");

    private String code;
    private String name;

    AlarmStatusEnum(String code, String name) {
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
