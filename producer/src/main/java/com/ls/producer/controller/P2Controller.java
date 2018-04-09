package com.ls.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("p2")
public class P2Controller {
    @Autowired
    DiscoveryClient client;

    @GetMapping("/ts2") //不能使用ts  已经在ProducerController中使用 否则初始化报错 所以feign路径只与mapping的value有关
    public String index() {
        return "hello2 " +  client.getServices();
    }
}
