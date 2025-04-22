package com.skill.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "<html><body><h1>Hello World,<h1> <h2>Greeting from Rest Controller!!</h2></body></html>";


    }

}
