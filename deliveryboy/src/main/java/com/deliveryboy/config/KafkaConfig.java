package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic topic(){
        // create topic in kafka server
        return TopicBuilder.name(ApplicationConstant.LOCATION_UPDATE_TOPIC).build();
    }
}
