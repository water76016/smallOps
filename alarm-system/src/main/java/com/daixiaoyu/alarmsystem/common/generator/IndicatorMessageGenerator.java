package com.daixiaoyu.alarmsystem.common.generator;

import com.daixiaoyu.alarmsystem.domain.IndicatorMessage;
import com.daixiaoyu.alarmsystem.mq.producer.IndicatorMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @program: alarm-system
 * @author: water76016
 * @description: 告警指标消息生成器
 * @version: v1.0.0
 * @create: 2024-02-03 14:04
 **/
@Component
public class IndicatorMessageGenerator {
    @Autowired
    private IndicatorMessageProducer messageProducer;

    @Scheduled(fixedDelay = 1000 * 60 * 5, initialDelay = 1000 * 5)
    public void createIndicatorMessage(){
        try {
            for (int i = 0; i < 5; i++){
                IndicatorMessage message = new IndicatorMessage();
                String resourceType = getResourceType();
                String resourceCode = getResourceCode();
                Map<String, Object> indicator = getIndicator();
                message.setResourceType(resourceType);
                message.setResourceCode(resourceCode);
                message.setIndicator(indicator);
                message.setDate(new Date());

                messageProducer.asyncSendMsg(message);
                System.out.println("指标消息生成成功--:" + message);
            }
        }
        catch (Exception e){
            System.out.println("指标消息发送失败");
        }
    }

    private String getResourceType(){
        Random random = new Random();
        int index = random.nextInt(5);
        return "resourceType--" + index;
    }

    private String getResourceCode(){
        Random random = new Random();
        int index = random.nextInt(5);
        return "resourceCode--" + index;
    }

    private Map<String, Object> getIndicator(){
        Random random = new Random();
        int index = random.nextInt(5);
        int status = random.nextInt(2);
        Map<String, Object> result = new HashMap<>();
        for (int i = 0; i < 3; i++){
            result.put("indicatorCode--" + index, status);
        }
        return result;
    }
}
