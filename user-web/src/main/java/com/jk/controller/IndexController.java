package com.jk.controller;

import com.jk.entity.Idea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("toIdeaList")
    public String toIdeaList(){ return "idea/ideaList"; }
    @RequestMapping("toMesList")
    public String toMesList(){ return "idea/mesList"; }

    @RequestMapping("tohua")
    public String tohua(){
        return "111";
    }

    @RequestMapping("home")
    public String tohome(){
        return "home";
    }

    @RequestMapping("login")
    public String tologin(){
        return "login";
    }

    @RequestMapping("product")
    public String toproduct(){
        return "product/lei";
    }
}
