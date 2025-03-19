package com.weather.api.report.weatherreport.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ApacheKafkaConsumer {

    @KafkaListener(topics = "my_topic", groupId = "test-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
