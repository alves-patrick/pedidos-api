package com.alvespatrick.pedidos_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;


@Configuration
     public class RabbitmqConfig{
    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;
    
}
