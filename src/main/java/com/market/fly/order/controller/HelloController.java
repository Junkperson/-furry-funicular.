package com.market.fly.order.controller;


import com.market.fly.plat.dao.UserRepository;
import com.market.fly.plat.mapper.UserMapper;
import com.market.fly.plat.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/hi")
    public String hi(Integer id){
        Map map = userMapper.queryUserById(id);
        System.out.println(map);
        User user = userRepository.findById(id.longValue());
        System.out.println(user);
        logger.debug("霓虹啊");
        return "hello world";
    }

}
