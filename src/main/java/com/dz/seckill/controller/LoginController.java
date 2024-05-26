package com.dz.seckill.controller;

import com.dz.seckill.service.IUserService;
import com.dz.seckill.utils.vo.LoginVo;
import com.dz.seckill.utils.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/toLogin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean dologin(LoginVo loginVo){
        log.info("{}",loginVo);
        return iUserService.doLogin(loginVo);
    }


}
