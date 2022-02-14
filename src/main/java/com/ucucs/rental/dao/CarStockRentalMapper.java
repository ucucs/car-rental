package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarStockRental;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarStockRentalMapper {
    int deleteByPrimaryKey(Integer stockId);

    int insert(CarStockRental record);

    int insertSelective(CarStockRental record);

    CarStockRental selectByPrimaryKey(Integer stockId);

    int updateByPrimaryKeySelective(CarStockRental record);

    int updateByPrimaryKey(CarStockRental record);
}