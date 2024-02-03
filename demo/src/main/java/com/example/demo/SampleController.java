package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // making APIs inside this class visible to the embedded server.
public class SampleController {
    //define APIs that will do certain tasks.
    //Landing point of all requests from various clients.

    //base url - 127.0.0.1:8080
    //api path - /sample, /hello
    //input

    @GetMapping("/hello")
    public String sayHello(@RequestParam("n") String name) {
        return "hello " + name;
    }
}
