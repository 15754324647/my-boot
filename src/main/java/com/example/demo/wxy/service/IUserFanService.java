package com.example.demo.wxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.wxy.entity.UserFan;

/**
 * <p>
 * 用户粉丝信息表 服务类
 * </p>
 *
 * @author Graciano
 * @since 2019-12-14
 */
public interface IUserFanService extends IService<UserFan> {
    String test(Long id);
}
