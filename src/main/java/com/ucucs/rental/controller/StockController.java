package com.ucucs.rental.controller;

import com.ucucs.rental.entity.CarBrand;
import com.ucucs.rental.entity.CarUser;
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
@Api(tags = "车辆库存管理模块", value = "StockController")
@RequestMapping("/car-stock")
@RestController
public class StockController {

    @ApiOperation("查询库存列表")
    @GetMapping("/")
    public List<CarBrand> stockList() {
        return null;
    }

    @ApiOperation("查询库存车辆信息")
    @GetMapping("/{stockId}")
    public CarBrand queryStockCar(@PathVariable("stockId") Integer stockId) {
        return null;
    }

    @ApiOperation("新增车辆入库")
    @PostMapping("/")
    public CarBrand addStockCar() {
        return null;
    }

    @ApiOperation("编辑库存车辆信息")
    @PutMapping("/{stockId}")
    public CarBrand editStockCar(@PathVariable("stockId") Integer stockId) {
        return null;
    }

    @ApiOperation("删除库存车辆信息")
    @DeleteMapping("/{stockId}")
    public CarUser deleteStockCar(@PathVariable("stockId") Integer stockId) {
        return null;
    }

    @ApiOperation("配置车辆租用信息")
    @PostMapping("/rent-config/{stockId}")
    public CarBrand configStockCar(@PathVariable("stockId") Integer stockId) {
        return null;
    }
}
