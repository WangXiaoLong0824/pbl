package com.jk.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogSenderService implements RabbitTemplate.ReturnCallback {
    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {

    }
    @Resource
    private RabbitTemplate rabbitTemplate;
    public void send(String logJson) {
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (ack){
                System.out.println("消息发送成功");
            }else {
                System.out.println("消息发送失败,"+cause+correlationData.toString());
            }
        });
        rabbitTemplate.convertAndSend("pbl",logJson);
    }
}
