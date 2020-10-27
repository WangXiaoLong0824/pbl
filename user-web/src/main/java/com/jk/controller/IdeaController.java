package com.jk.controller;

import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import com.jk.service.HuiYuanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("idea")
public class IdeaController {

    @Resource
    private HuiYuanService huiyuanService;

    @RequestMapping("findIdea")
    public String findIdea(Model model){
        model.addAttribute("ideaList",huiyuanService.findIdea());
        return "ideaList";
    }

    @RequestMapping("addIdea")
    public String addIdea(Idea idea){
        huiyuanService.addIdea(idea);
        return "redirect:findIdea";
    }

    @RequestMapping("deleteIdea")
    public String deleteIdea(Integer ideaId){
        huiyuanService.deleteById(ideaId);
        return "redirect:findIdea";
    }

    @RequestMapping("findOne")
    public String findOne(Integer ideaId,Model model){
        model.addAttribute("idea",huiyuanService.findIdeaById(ideaId));
        return "addIdea";
    }

    @RequestMapping("findIdeaPage")
    public PageResult findIdeaPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Idea idea){
        return huiyuanService.findIdeaPage(currPage,pageSize,idea);
    }
}
