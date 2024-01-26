package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @GetMapping("/sum")
    public int sum(@RequestParam("a") String a, @RequestParam("b") String b) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);

        return sum;
    }

    @GetMapping("/minus")
    public int minus(@RequestParam("a") String a, @RequestParam("b") String b) {
        int sum = Integer.parseInt(a) - Integer.parseInt(b);

        return sum;
    }

    @GetMapping("/divide")
    public int divide(@RequestParam("a") String a, @RequestParam("b") String b) {
        int sum = Integer.parseInt(a) / Integer.parseInt(b);

        return sum;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") String a, @RequestParam("b") String b) {
        int sum = Integer.parseInt(a) * Integer.parseInt(b);

        return sum;
    }

}
