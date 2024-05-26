package com.dz.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dz.seckill.pojo.User;
import com.dz.seckill.utils.vo.LoginVo;
import com.dz.seckill.utils.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author dz
 * @since 2024-05-21
 */
public interface IUserService extends IService<User> {


    RespBean doLogin(LoginVo loginVo);
}
