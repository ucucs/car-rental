package com.ucucs.rental.dao;

import com.ucucs.rental.entity.CarUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(CarUser record);

    int insertSelective(CarUser record);

    CarUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(CarUser record);

    int updateByPrimaryKey(CarUser record);
}