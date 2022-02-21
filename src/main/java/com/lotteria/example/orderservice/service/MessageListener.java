package com.lotteria.example.orderservice.service;

import com.lotteria.example.orderservice.config.MQConfig;
import com.lotteria.example.orderservice.controller.OrderController;
import com.lotteria.example.orderservice.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        OrderController.number = message.getNumber();
        System.out.println(message);
    }

}
