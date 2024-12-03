package com.daixiaoyu.alarmsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableScheduling
@MapperScan("com.daixiaoyu.alarmsystem.mapper")
public class AlarmSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlarmSystemApplication.class, args);
    }

}
