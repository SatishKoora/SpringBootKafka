package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "test_topic1";

    public void send(String message){
        kafkaTemplate.send(kafkaTopic, message);
    }
}
