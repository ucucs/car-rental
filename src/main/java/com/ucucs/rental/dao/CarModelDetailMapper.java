package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarModelDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarModelDetailMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(CarModelDetail record);

    int insertSelective(CarModelDetail record);

    CarModelDetail selectByPrimaryKey(Integer carId);

    int updateByPrimaryKeySelective(CarModelDetail record);

    int updateByPrimaryKey(CarModelDetail record);
}