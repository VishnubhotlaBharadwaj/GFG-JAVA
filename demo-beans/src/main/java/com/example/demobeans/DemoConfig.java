package com.example.demobeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DemoConfig {

    private Logger logger = LoggerFactory.getLogger(DemoConfig.class);
    @Bean
    public RestTemplate getTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        logger.info("Inside getTemplate: obj = {}", restTemplate);
        return restTemplate;
    }

}
