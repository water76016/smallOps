package com.daixiaoyu.alarmsystem.service.impl;

import com.daixiaoyu.alarmsystem.entity.AlarmRule;
import com.daixiaoyu.alarmsystem.mapper.AlarmRuleMapper;
import com.daixiaoyu.alarmsystem.service.AlarmRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 16:14
 **/
@Service
public class AlarmRuleServiceImpl implements AlarmRuleService {
    @Autowired
    private AlarmRuleMapper alarmRuleMapper;


    @Override
    public void insertAlarmRule(AlarmRule alarmRule) {
        alarmRuleMapper.insertAlarmRule(alarmRule);
    }

    @Override
    public void updateAlarmRule(AlarmRule alarmRule) {

    }

    @Override
    public List<AlarmRule> queryAlarmRule() {
        return alarmRuleMapper.queryAlarmRule();
    }
}
