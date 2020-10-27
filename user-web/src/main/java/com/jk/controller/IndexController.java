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
    @RequestMapping("HuiYuanLevel")
    public String toHuiYuanLevel(){
        return "huiyuan/huiyuanlevel";
    }

    @RequestMapping("toIdeaList")
    public String toIdeaList(){ return "ideaList"; }
    @RequestMapping("toAddIdea")
    public String toAddIdea(Model model){
        model.addAttribute("idea",new Idea());
        return "addIdea";
    }
}
