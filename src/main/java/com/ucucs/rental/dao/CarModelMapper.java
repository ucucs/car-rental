package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarModelMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(CarModel record);

    int insertSelective(CarModel record);

    CarModel selectByPrimaryKey(Integer carId);

    int updateByPrimaryKeySelective(CarModel record);

    int updateByPrimaryKey(CarModel record);
}