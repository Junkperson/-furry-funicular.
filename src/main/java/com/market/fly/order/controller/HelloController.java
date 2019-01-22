package com.market.fly.order.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);


    @RequestMapping("/hi")
    public String hi(Integer id){
        logger.debug("霓虹啊");
        return "hello world";
    }

}
