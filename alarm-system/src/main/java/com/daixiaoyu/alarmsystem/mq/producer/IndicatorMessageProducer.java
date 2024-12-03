package com.daixiaoyu.alarmsystem.mq.producer;

import com.alibaba.fastjson.JSON;
import com.daixiaoyu.alarmsystem.domain.IndicatorMessage;
import com.daixiaoyu.alarmsystem.mq.listener.ProducerSendResultListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 16:06
 **/
@Component
public class IndicatorMessageProducer {
    private final String TOPIC_NAME = "indicator_message";

    @Autowired
    private ProducerSendResultListener listener;
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void asyncSendMsg(IndicatorMessage message){
        kafkaTemplate.setProducerListener(listener);
        kafkaTemplate.send(TOPIC_NAME, message.getId(), JSON.toJSONString(message));
    }
}
