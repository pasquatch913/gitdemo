package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {


    @GetMapping("/hello2")
    public String getHello() {
        return "hello2";
    }

}
