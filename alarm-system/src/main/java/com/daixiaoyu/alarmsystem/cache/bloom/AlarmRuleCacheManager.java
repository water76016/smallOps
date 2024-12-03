package com.daixiaoyu.alarmsystem.cache.bloom;

import cn.hutool.core.collection.CollUtil;
import com.daixiaoyu.alarmsystem.entity.AlarmRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: alarm-system
 * @author: water76016
 * @description: 告警规则缓存管理器
 * @version: v1.0.0
 * @create: 2024-02-03 13:43
 **/
@Component
public class AlarmRuleCacheManager {
    private final String alarmRuleRedisKey = "alarm-rule";

    @Autowired
    private RedisTemplate redisTemplate;

    public void insertAlarmRuleToCache(AlarmRule alarmRule){
        redisTemplate.opsForHash().put(alarmRuleRedisKey, alarmRule.getUniqueId(), alarmRule);
    }
}
