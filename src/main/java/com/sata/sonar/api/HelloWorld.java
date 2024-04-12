package com.sata.sonar.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @GetMapping("/hello")
    public String getMyName() {
        return "hello world form KRK";
    }
}
