package com.jk.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConrig {
    @Bean
    public Queue logQueue(){
        return  new Queue("pbl");
    }
    @Bean
    public FanoutExchange exchange(){
        return new FanoutExchange("fanout");
    }
    @Bean
    public Binding bindingAckQueueExchange(Queue logQueue,FanoutExchange exchange){
        return BindingBuilder.bind(logQueue).to(exchange);
    }
}
