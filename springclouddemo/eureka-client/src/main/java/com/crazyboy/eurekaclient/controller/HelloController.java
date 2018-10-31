package com.crazyboy.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping("sayHello")
    public String sayHello(String name){
        return "hi, " + name + ", i am from " + port;
    }
}
