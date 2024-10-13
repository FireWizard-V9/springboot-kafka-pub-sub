package com.wizard.kafka_consumer_example.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger= LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "springboot-producer-4",groupId = "wizard-2")
    public void consume( String message){
       logger.info("consumer-1 consume the message {}", message);
    }

    @KafkaListener(topics="springboot-producer-4",groupId = "wizard-2")
    public void consume2(String message){
        logger.info("consumer-2 consume the message {}", message);

    }

    @KafkaListener(topics="springboot-producer-4",groupId = "wizard-2")
    public void consume3(String message){
        logger.info("consumer-3 consume the message {}", message);

    }

    @KafkaListener(topics="springboot-producer-4",groupId = "wizard-2")
    public void consume4(String message){
        logger.info("consumer-4 consume the message {}", message);

    }
}
