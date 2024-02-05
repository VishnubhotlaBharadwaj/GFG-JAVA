package com.example.demobeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    DemoConfig demoConfig; // field dependency injection

    @Autowired
    DemoService demoService;

    @GetMapping("/test")
    public String sayHello(){
        RestTemplate restTemplate = demoConfig.getTemplate(); // No null pointer exception
        this.logger.info("Inside getTemplate, obj = {}", restTemplate);
        return "Hello World!!";
    }
}
