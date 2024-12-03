package com.daixiaoyu.alarmsystem.service.impl;

import com.daixiaoyu.alarmsystem.entity.AlarmOrigin;
import com.daixiaoyu.alarmsystem.mapper.AlarmOriginMapper;
import com.daixiaoyu.alarmsystem.service.AlarmOriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 16:13
 **/
@Service
public class AlarmOriginServiceImpl implements AlarmOriginService {
    @Autowired
    private AlarmOriginMapper alarmOriginMapper;

    @Override
    public void insertAlarmOrigin(AlarmOrigin alarmOrigin) {
        alarmOriginMapper.insertAlarmOrigin(alarmOrigin);
    }

    @Override
    public AlarmOrigin getAlarmOriginById(String id) {
        return null;
    }

    @Override
    public List<AlarmOrigin> queryAlarmOrigin() {
        return alarmOriginMapper.queryAlarmOrigin();
    }
}
