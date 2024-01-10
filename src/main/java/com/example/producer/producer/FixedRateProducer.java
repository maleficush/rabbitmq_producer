package com.example.producer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    private final String ROUTING_KEY = "course.fixedrate";


    private int i = 0;

    public void sendMessage(){
        i++;
        rabbitTemplate.convertAndSend(ROUTING_KEY, "Fixed rate : " + i  );
    }
}
