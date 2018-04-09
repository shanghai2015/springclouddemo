package com.ls.consumerfeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("producer")
public  interface  FeignUtill {

    @GetMapping("/p/ts")
    public String index();
}
