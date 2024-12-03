package com.daixiaoyu.alarmsystem.mapper;

import com.daixiaoyu.alarmsystem.entity.AlarmOrigin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 15:18
 **/
@Mapper
public interface AlarmOriginMapper {
    void insertAlarmOrigin(@Param("alarm")AlarmOrigin alarmOrigin);

    List<AlarmOrigin> queryAlarmOrigin();
}
