package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CalculateController {

    @GetMapping("chat")
    public String chat() {

        return "chatInterface";
    }


}
