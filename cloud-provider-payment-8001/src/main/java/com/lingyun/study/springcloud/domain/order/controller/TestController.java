package com.lingyun.study.springcloud.domain.order.controller;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/create")
    public String create(){
        return"test create";
    }

}
