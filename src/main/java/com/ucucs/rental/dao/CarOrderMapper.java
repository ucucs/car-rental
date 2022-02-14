package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(CarOrder record);

    int insertSelective(CarOrder record);

    CarOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(CarOrder record);

    int updateByPrimaryKey(CarOrder record);
}