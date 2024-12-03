package com.daixiaoyu.alarmsystem.service;

import com.daixiaoyu.alarmsystem.entity.AlarmRule;

import java.util.List;

public interface AlarmRuleService {
    void insertAlarmRule(AlarmRule alarmRule);

    void updateAlarmRule(AlarmRule alarmRule);

    List<AlarmRule> queryAlarmRule();
}
