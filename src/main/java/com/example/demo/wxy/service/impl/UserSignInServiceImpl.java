package com.example.demo.wxy.service.impl;

import com.example.demo.wxy.entity.UserSignIn;
import com.example.demo.wxy.mapper.UserSignInMapper;
import com.example.demo.wxy.service.IUserSignInService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户签到表 服务实现类
 * </p>
 *
 * @author Graciano
 * @since 2019-12-24
 */
@Service
public class UserSignInServiceImpl extends ServiceImpl<UserSignInMapper, UserSignIn> implements IUserSignInService {

    @Override
    public String test(Long id) {
        return "测试调用方法UserSignInServiceImpl";
    }
}
