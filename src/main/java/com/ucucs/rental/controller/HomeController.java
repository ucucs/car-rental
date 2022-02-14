package com.ucucs.rental.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 13.02.2022
 */
@Api(tags = "系统首页", value = "HomeController")
@RequestMapping("/")
@RestController
public class HomeController {

    @ApiOperation("首页信息")
    @GetMapping("/")
    public String index() {
        return "Welcome to use Car Rental System";
    }
}
