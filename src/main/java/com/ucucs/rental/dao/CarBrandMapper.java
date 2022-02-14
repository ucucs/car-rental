package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarBrand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    CarBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(CarBrand record);

    int updateByPrimaryKey(CarBrand record);
}