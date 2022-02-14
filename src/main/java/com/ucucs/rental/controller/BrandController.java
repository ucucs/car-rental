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
@Api(tags = "车辆品牌管理模块", value = "BrandController")
@RequestMapping("/brand")
@RestController
public class BrandController {

    @ApiOperation("查询品牌列表")
    @GetMapping("/")
    public List<CarBrand> brandList() {
        return null;
    }

    @ApiOperation("查询品牌信息")
    @GetMapping("/{brandId}")
    public CarBrand queryBrand(@PathVariable("brandId") Integer brandId) {
        return null;
    }

    @ApiOperation("新增车辆品牌")
    @PostMapping("/")
    public CarBrand addBrand() {
        return null;
    }

    @ApiOperation("编辑车辆品牌")
    @PutMapping("/{brandId}")
    public CarBrand editBrand(@PathVariable("brandId") Integer brandId) {
        return null;
    }

    @ApiOperation("删除用户信息")
    @DeleteMapping("/{brandId}")
    public CarUser deleteBrand(@PathVariable("brandId") Integer brandId) {
        return null;
    }

}
