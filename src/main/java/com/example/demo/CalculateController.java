package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @GetMapping("/sum")
    public String sum(@RequestParam("a") String a, @RequestParam("b") String b) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);

        return String.valueOf(sum);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("a") String a, @RequestParam("b") String b) {
        int minus = Integer.parseInt(a) - Integer.parseInt(b);

        return String.valueOf(minus);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("a") String a, @RequestParam("b") String b) {
        int divide = Integer.parseInt(a) / Integer.parseInt(b);

        return String.valueOf(divide);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("a") String a, @RequestParam("b") String b) {
        int multiply = Integer.parseInt(a) * Integer.parseInt(b);

        return String.valueOf(multiply);
    }

}
