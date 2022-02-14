package com.ucucs.rental.controller;

import com.ucucs.rental.entity.CarUser;
import com.ucucs.rental.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 13.02.2022
 */
@Api(tags = "用户管理模块", value = "UserController")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询用户列表")
    @GetMapping("/")
    public CarUser userList() {
        return userService.getUser(null);
    }

    @ApiOperation("查询用户信息")
    @GetMapping("/{userId}")
    public CarUser queryUser(@PathVariable("userId") Integer userId) {
        return null;
    }

    @ApiOperation("新增用户信息")
    @PostMapping("/")
    public CarUser addUser() {
        return null;
    }

    @ApiOperation("编辑用户信息")
    @PutMapping("/{userId}")
    public CarUser editUser(@PathVariable("userId") Integer userId) {
        return null;
    }

    @ApiOperation("删除用户信息")
    @DeleteMapping("/{userId}")
    public CarUser deleteUser(@PathVariable("userId") Integer userId) {
        return null;
    }

}
