package com.crazyboy.serverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServcie {
    @Autowired
    RestTemplate restTemplate;

    public String sayHello(String name){
        return restTemplate.getForObject("http://service-hello/sayHello?name=" + name, String.class);
    }
}
