package com.junkperpen.fly.order.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/hi")
    public String hi(){
        return "hello world";
    }

}
