package com.example.aws_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/home")
    public String home(){
        return "Welcome to home page";
    }
}
