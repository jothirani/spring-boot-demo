package com.example.demo_aws;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String health() {
        return "Hello Geeks And Welcome to GeeksForGeeks !!!";
    }
}