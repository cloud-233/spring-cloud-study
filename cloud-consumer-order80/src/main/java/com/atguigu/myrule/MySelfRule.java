package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liliang on 2021.06.17
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule MyRule(){
        return new RandomRule();
    }
}
