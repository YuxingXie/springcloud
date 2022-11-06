package com.lingyun.study.springcloud.controller;

import com.lingyun.study.springcloud.send.SendingDrink;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamController {
    private SendingDrink sendingDrink;

    public StreamController(SendingDrink sendingDrink) {
        this.sendingDrink = sendingDrink;
    }

    @GetMapping("/send_cold_drink")
    public boolean send(@RequestParam String drink){
        System.out.println("cold drink will send:"+drink);
        return sendingDrink.sendColdDrinks(drink);
    }
}
