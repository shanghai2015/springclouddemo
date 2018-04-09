package com.ls.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("p")
public class ProducerController {

    @Autowired
    DiscoveryClient client;

    @GetMapping("/ts")
    public String index() {
        return "hello1 " +  client.getServices();
    }
}
