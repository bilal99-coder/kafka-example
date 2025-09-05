package com.bilalsahli.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic newTopic() {
        return new NewTopic("topic1", 1, (short) 1);
    }
}
