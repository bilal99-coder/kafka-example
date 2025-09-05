package com.bilalsahli;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListeners {
    @KafkaListener(topics = "topic1", groupId = "groupId")
    void Listener(String data){
        System.out.println("Received data: " + data);
    }
}
