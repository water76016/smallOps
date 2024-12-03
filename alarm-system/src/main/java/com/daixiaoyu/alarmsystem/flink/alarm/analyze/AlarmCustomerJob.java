package com.daixiaoyu.alarmsystem.flink.alarm.analyze;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer011;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @program: alarm-system
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-02-03 15:01
 **/
@Component
@Order(2)
public class AlarmCustomerJob implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("开始启动flink告警消费程序");
        try {
            //创建执行环境
            StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
            //kafka配置类
            Properties properties = new Properties();
            properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
            properties.setProperty("group.id", "consumer-group");
            properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            properties.setProperty("auto.offset.reset", "latest");

//            //从kafka中读取数据
//            DataStreamSource<String> sensor = env.addSource(new FlinkKafkaConsumer011<String>("indicator_message",
//                    new SimpleStringSchema(), properties));
            DataStreamSource<String> sensor = env.addSource(new FlinkKafkaConsumer011<String>("sensor", new SimpleStringSchema(), properties));
            sensor.print();
            //执行
            env.execute();
        }
        catch (Exception e){
            System.out.println("flink执行失败");
        }
    }
}
