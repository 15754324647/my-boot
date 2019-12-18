package com.example.demo.wxy.api.dto;

import lombok.Data;

/**
 * 用户注册dto
 *
 * @author limeiqi
 * @date 2019/12/18
 **/
@Data
public class UserInfoRegisterDTO {


    private String userName;

    private String realName;

    private String nick;

    private String password;

    private String mobile;


}
