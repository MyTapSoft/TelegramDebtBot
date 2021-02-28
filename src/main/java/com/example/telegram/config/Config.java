package com.example.telegram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;

@Configuration
public class Config {
    @Bean
    public DefaultBotOptions getDefaultBotOptionsBean() {
        return new DefaultBotOptions();
    }

}
