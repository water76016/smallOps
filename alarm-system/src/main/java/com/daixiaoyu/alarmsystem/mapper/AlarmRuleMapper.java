package com.daixiaoyu.alarmsystem.mapper;

import com.daixiaoyu.alarmsystem.entity.AlarmRule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 15:20
 **/
@Mapper
public interface AlarmRuleMapper {
    void insertAlarmRule(@Param("alarmRule")AlarmRule alarmRule);
    void updateAlarmRule(@Param("alarmRule")AlarmRule alarmRule);
    List<AlarmRule> queryAlarmRule();
}
