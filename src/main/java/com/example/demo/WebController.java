package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class WebController {

    @GetMapping("/random")
    public UUID getRandom() {
        return UUID.randomUUID();

    }
    
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

}
