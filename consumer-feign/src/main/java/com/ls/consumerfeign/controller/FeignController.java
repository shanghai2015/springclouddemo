package com.ls.consumerfeign.controller;

import com.ls.consumerfeign.feign.FeignUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignUtill feignUtill;

    @GetMapping("ts")
    public String feignTest() {
        return feignUtill.index();

    }
}
