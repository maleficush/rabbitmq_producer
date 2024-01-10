package com.example.producer.producer;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private final String ROUTING_KEY = "course.hello";

    public void sendHello(String message){
        rabbitTemplate.convertAndSend(ROUTING_KEY, message);
        rabbitTemplate.convertAndSend(ROUTING_KEY, message);
        rabbitTemplate.convertAndSend(ROUTING_KEY, message);

    }


}
