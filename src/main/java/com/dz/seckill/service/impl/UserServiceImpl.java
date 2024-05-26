package com.dz.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dz.seckill.mapper.UserMapper;
import com.dz.seckill.pojo.User;
import com.dz.seckill.service.IUserService;
import com.dz.seckill.utils.vo.LoginVo;
import com.dz.seckill.utils.vo.RespBean;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author dz
 * @since 2024-05-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public RespBean doLogin(LoginVo loginVo) {
        return null;
    }
}
