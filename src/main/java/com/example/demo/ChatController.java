package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CalculateController {

    @RequestMapping("/chat")
    public String chat() {

        return "chatInterface";
    }


}
