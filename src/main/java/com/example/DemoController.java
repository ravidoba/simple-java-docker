package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/test")
    public String getTesting() {
        log.info("Get test API calls !");
        return "Get Testing API !";
    }

    @PostMapping("/test")
    public String postTesting() {
        return "Post Testing API !";
    }
}
