package com.ucucs.rental.dao.ext;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarRentalExtMapper {

    List<Object> queryCarList();

}