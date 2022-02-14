package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(CarType record);

    int insertSelective(CarType record);

    CarType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
}