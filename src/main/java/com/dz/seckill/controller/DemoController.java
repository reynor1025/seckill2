package com.dz.seckill.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","xx");
        return "hello";
    }


}
