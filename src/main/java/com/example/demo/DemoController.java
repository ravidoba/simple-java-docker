package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public String getTesting() {
        return "Get Testing API !";
    }

    @PostMapping("/test")
    public String postTesting() {
        return "Post Testing API !";
    }
}
