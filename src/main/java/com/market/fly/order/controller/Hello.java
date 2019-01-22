package com.market.fly.order.controller;


import com.market.fly.plat.mapper.UserMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/hello")
public class Hello {

    private static final Log logger = LogFactory.getLog(Hello.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hi")
    public String hi(){
        logger.debug("霓虹啊");
        return "hello world";
    }

    @RequestMapping("/hi")
    public String hi(Integer id){
        Map map = userMapper.queryUserById(id);
        System.out.println(map);
        return "hello world";
    }

}
