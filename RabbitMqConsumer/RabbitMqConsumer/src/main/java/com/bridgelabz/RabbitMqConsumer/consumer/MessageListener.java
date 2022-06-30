//package com.bridgelabz.RabbitMqConsumer.consumer;
//
//import com.bridgelabz.RabbitMqConsumer.config.MQConfig;
//import com.bridgelabz.RabbitMqConsumer.dto.CustomMessage;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageListener {
//
//    @RabbitListener(queues = MQConfig.QUEUE)
//    public void listener(CustomMessage message) {
//        System.out.println(message);
//    }
//
//}
