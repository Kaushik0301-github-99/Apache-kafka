package com.enduser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    private final static Logger LOG = LoggerFactory.getLogger(KafkaConfig.class);
    @KafkaListener(topics = ApplicationConstant.LOCATION_UPDATE_TOPIC,groupId = ApplicationConstant.GROUP_ID)
    public void updatedLocation(String value){
        LOG.info("message received -> {} ",value);
    }
}
