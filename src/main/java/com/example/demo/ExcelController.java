package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ExcelController {

    @RequestMapping("/jsontoexcel")
    public String jsonToExcel() {

        return "jsonToExcel";
    }
}
