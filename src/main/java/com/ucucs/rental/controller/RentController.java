package com.ucucs.rental.controller;

import com.ucucs.rental.dto.StockCarDto;
import com.ucucs.rental.service.RentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 13.02.2022
 */
@Api(tags = "车辆租赁", value = "RentController")
@RequestMapping("/car-rent")
@RestController
public class RentController {

    @Autowired
    private RentService rentService;

    @ApiOperation("查询可租用车辆")
    @GetMapping("/")
    public List<StockCarDto> carList() {
        return null;
    }

    @ApiOperation("租用车辆")
    @PostMapping("/{stockId}")
    public StockCarDto rantCar(@PathVariable("stockId") Integer stockId) {
        return null;
    }

    @ApiOperation("归还车辆")
    @DeleteMapping("/{stockId}")
    public StockCarDto returnCar(@PathVariable("stockId") Integer stockId) {
        return null;
    }
}
