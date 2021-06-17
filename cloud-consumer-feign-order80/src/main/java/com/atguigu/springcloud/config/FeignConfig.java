package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liliang on 2021.06.17
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
