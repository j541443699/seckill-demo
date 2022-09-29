package com.xxxx.seckill.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Date:2022/9/29 13:33
 * Author:jyq
 * Description:RabbitMQ配置类
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue() {
        return new Queue("queue", true);
    }

}
