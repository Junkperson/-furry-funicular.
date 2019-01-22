package com.market.fly.plat.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("select * from plat_user where id =#{id}")
    Map queryUserById(@Param("id") Integer id);

}
