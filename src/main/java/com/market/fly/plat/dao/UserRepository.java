package com.market.fly.plat.dao;

import com.market.fly.plat.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

@Mapper
public interface UserRepository extends JpaRepository<User, Long> {


    User findById(Long id);

}


