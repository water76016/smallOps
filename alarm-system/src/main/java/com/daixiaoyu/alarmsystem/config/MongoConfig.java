package com.daixiaoyu.alarmsystem.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @program: alarm-system
 * @author: water76016
 * @description: mongodb配置类
 * @version: v1.0.0
 * @create: 2024-02-03 14:46
 **/
@Configuration
@EnableMongoRepositories(basePackages = "com.daixiaoyu.alarmsystem.logger")
public class MongoConfig extends AbstractMongoClientConfiguration {
    @Value("${spring.data.mongodb.url}")
    private String mongodbUri;


    @Override
    protected String getDatabaseName() {
        return "alarm-system";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(mongodbUri);
    }
}
