package com.crazyboy.serverribbon.controller;

import com.crazyboy.serverribbon.service.HelloServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloServcie helloServcie;

    @GetMapping("sayHello")
    public String sayHello(String name){
        return helloServcie.sayHello(name);
    }
}
