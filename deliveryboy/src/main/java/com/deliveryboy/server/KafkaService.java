package com.deliveryboy.server;

import com.deliveryboy.config.ApplicationConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    // to produce the message we will need kafkatemplate
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private  static Logger LOG = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        this.kafkaTemplate.send(ApplicationConstant.LOCATION_UPDATE_TOPIC,location);
        LOG.info("message produced");
        return true;
    }
}
