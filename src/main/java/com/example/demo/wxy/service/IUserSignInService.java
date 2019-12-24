package com.example.demo.wxy.service;

import com.example.demo.wxy.entity.UserSignIn;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户签到表 服务类
 * </p>
 *
 * @author Graciano
 * @since 2019-12-24
 */
public interface IUserSignInService extends IService<UserSignIn> {

    String test(Long id);

}
