package com.market.fly.order.service.impl;

import com.market.fly.order.service.HelloService;
import com.market.fly.plat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }
}
