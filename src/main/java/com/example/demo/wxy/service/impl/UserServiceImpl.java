package com.example.demo.wxy.service.impl;

import com.example.demo.wxy.entity.User;
import com.example.demo.wxy.mapper.UserMapper;
import com.example.demo.wxy.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
