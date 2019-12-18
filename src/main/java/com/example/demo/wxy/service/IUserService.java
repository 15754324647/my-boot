package com.example.demo.wxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.wxy.api.dto.UserInfoRegisterDTO;
import com.example.demo.wxy.entity.User;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Graciano
 * @since 2019-12-14
 */
public interface IUserService extends IService<User> {

    Integer insertUserInfo(UserInfoRegisterDTO dto);

}
