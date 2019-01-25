package com.market.fly.order.mapper;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface OrderMapper {

    @Select("select * from t_busi_order_info where id =#{id}")
    Map queryOrderById(@Param("id") Integer id);

}
