package com.example.zoo.config;

import com.example.zoo.management.ZooManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ZooManager zooManager() {
        return new ZooManager();
    }
}