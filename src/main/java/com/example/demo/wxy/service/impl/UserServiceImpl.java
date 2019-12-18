package com.example.demo.wxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.wxy.api.dto.UserInfoRegisterDTO;
import com.example.demo.wxy.entity.User;
import com.example.demo.wxy.mapper.UserMapper;
import com.example.demo.wxy.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Graciano
 * @since 2019-12-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUserInfo(UserInfoRegisterDTO dto) {
        User user = new User();
        BeanUtils.copyProperties(dto, user);

        return userMapper.insert(user);
    }
}
