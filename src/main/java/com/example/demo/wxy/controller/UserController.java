package com.example.demo.wxy.controller;


import com.example.demo.common.Response;
import com.example.demo.wxy.api.dto.UserInfoRegisterDTO;
import com.example.demo.wxy.entity.User;
import com.example.demo.wxy.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Graciano
 * @since 2019-12-14
 */
@Api("用户模块")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @ApiOperation(value = "用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Response<List<User>> getUserInfo() {
        Response<List<User>> response = new Response<>();
        response.setResult(iUserService.list());
        return response;
    }


    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Response<Integer> insertUserInfo(@RequestBody UserInfoRegisterDTO registerDTO) {
        Response<Integer> response = new Response<>();
        response.setResult(iUserService.insertUserInfo(registerDTO));
        return response;
    }
}

