package com.kukulam.springhello.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {
    @GetMapping("/hello")
    public HelloResponse hello(@RequestParam String name) {
        String message = "Hello " + name;
        return new HelloResponse(message);
    }
}
