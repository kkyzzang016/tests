package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
