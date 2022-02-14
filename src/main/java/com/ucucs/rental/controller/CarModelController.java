package com.ucucs.rental.controller;

import com.ucucs.rental.entity.CarModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 13.02.2022
 */
@Api(tags = "车型管理模块", value = "CarModelController")
@RequestMapping("/car-model")
@RestController
public class CarModelController {

    @ApiOperation("查询车型列表")
    @GetMapping("/")
    public List<CarModel> carModelList() {
        return null;
    }

    @ApiOperation("查询车型信息")
    @GetMapping("/{carId}")
    public CarModel queryCarModel(@PathVariable("carId") Integer carId) {
        return null;
    }

    @ApiOperation("新增车型")
    @PostMapping("/")
    public CarModel addCarModel() {
        return null;
    }

    @ApiOperation("编辑车型")
    @PutMapping("/{carId}")
    public CarModel editCarModel(@PathVariable("carId") Integer carId) {
        return null;
    }

    @ApiOperation("删除车型")
    @DeleteMapping("/{brandId}")
    public CarModel deleteBrand(@PathVariable("brandId") Integer brandId) {
        return null;
    }

}
