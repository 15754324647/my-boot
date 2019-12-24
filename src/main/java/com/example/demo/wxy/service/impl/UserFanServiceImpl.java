package com.example.demo.wxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.wxy.entity.UserFan;
import com.example.demo.wxy.mapper.UserFanMapper;
import com.example.demo.wxy.service.IUserFanService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户粉丝信息表 服务实现类
 * </p>
 *
 * @author Graciano
 * @since 2019-12-14
 */
@Service
public class UserFanServiceImpl extends ServiceImpl<UserFanMapper, UserFan> implements IUserFanService {

    @Override
    public String test(Long id) {
        return "测试调用方法UserFanServiceImpl";
    }
}
