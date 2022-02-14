package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarStock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarStockMapper {
    int deleteByPrimaryKey(Integer stockId);

    int insert(CarStock record);

    int insertSelective(CarStock record);

    CarStock selectByPrimaryKey(Integer stockId);

    int updateByPrimaryKeySelective(CarStock record);

    int updateByPrimaryKey(CarStock record);
}