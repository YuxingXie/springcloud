package com.lingyun.study.springcloud.domain.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个控制器不在网关配置，看看通过网关访问和直接访问分别会如何
 */
@RestController
@RequestMapping("/api/backdoor")
public class BackdoorController {
    @GetMapping("/create")
    public String create(){
        return"backdoor create";
    }
}
