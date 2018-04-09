package com.ls.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("ts")
    public String hello() {
        ServiceInstance  serviceInstance=  loadBalancerClient.choose("producer");
        String url =  "http://"+serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/ts";

        return restTemplate.getForObject(url,String.class);
    }

}
