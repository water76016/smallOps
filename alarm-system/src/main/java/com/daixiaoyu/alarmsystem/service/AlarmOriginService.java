package com.daixiaoyu.alarmsystem.service;

import com.daixiaoyu.alarmsystem.entity.AlarmOrigin;

import java.util.List;

public interface AlarmOriginService {
    void insertAlarmOrigin(AlarmOrigin alarmOrigin);

    AlarmOrigin getAlarmOriginById(String id);

    List<AlarmOrigin> queryAlarmOrigin();
}
