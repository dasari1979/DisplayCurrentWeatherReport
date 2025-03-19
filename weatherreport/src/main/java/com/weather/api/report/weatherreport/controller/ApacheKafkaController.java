package com.weather.api.report.weatherreport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.api.report.weatherreport.service.ApacheKafkaProducer;

@RestController
@RequestMapping("/kafka")
public class ApacheKafkaController {

    @Autowired
    private ApacheKafkaProducer kafkaProducer;

    @PostMapping("/send")
    public String sendMessageToKafka(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}
