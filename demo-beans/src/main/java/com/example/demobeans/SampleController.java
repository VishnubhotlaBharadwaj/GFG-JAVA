package com.example.demobeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    DemoConfig demoConfig;

    @GetMapping("/test")
    public String sayHello(){
        RestTemplate restTemplate = demoConfig.getTemplate();
        this.logger.info("Inside getTemplate, obj = {}", restTemplate);
        return "Hello World!!";
    }
}
