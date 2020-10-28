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

@RestController
@RequestMapping("idea")
public class IdeaController {

    @Resource
    private HuiYuanService huiyuanService;

    @RequestMapping("findIdea")
    public List<Idea> findIdea(){
        return huiyuanService.findIdea();
    }

    @RequestMapping("addIdea")
    public void addIdea(Idea idea){
        huiyuanService.addIdea(idea);
    }

    @RequestMapping("deleteIdea")
    public void deleteIdea(Integer ideaId){
        huiyuanService.deleteById(ideaId);
    }

    @RequestMapping("findOne")
    public Idea findOne(Integer ideaId){
        return huiyuanService.findIdeaById(ideaId);
    }

    @RequestMapping("findIdeaPage")
    public PageResult findIdeaPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Idea idea){
        return huiyuanService.findIdeaPage(currPage,pageSize,idea);
    }

    @RequestMapping("findMesPage")
    public PageResult findMesPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Idea idea){
        return huiyuanService.findMessagePage(currPage,pageSize,idea);
    }

    @RequestMapping("addMes")
    public void addMes(Idea idea){
        huiyuanService.addMessage(idea);
    }

    @RequestMapping("deleteMesById")
    public void deleteMesById(Integer ideaId){
        huiyuanService.deleteMesById(ideaId);
    }

    @RequestMapping("findMesById")
    public Idea findMesById(Integer ideaId){
        return huiyuanService.findMesById(ideaId);
    }
}
