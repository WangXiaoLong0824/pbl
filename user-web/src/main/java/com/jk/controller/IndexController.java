package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String toindex(){
        return "index";
    }

    @RequestMapping("huiYuanLevel")
    public String tohuiYuanLevel(){
        return "huiyuan/huiyuanlevel";
    }



}
