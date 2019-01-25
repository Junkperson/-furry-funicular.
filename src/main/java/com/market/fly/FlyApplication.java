package com.market.fly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.market.fly.plat.mapper")
public class FlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyApplication.class, args);
	}

}

