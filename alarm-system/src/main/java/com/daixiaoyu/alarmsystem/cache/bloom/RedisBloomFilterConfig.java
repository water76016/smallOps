package com.daixiaoyu.alarmsystem.cache.bloom;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: alarm-system
 * @author: water76016
 * @description: Redis布隆过滤器
 * @version: v1.0.0
 * @create: 2024-02-03 11:02
 **/
@Configuration
public class RedisBloomFilterConfig {
    @Autowired
    private RedissonClient redissonClient;

    @Bean
    public RBloomFilter<String> bloomFilter(){
        RBloomFilter<String> bloomFilter = redissonClient.getBloomFilter("bloomtest");
        bloomFilter.tryInit((long)1E8, 0.003);
        return bloomFilter;
    }
}
