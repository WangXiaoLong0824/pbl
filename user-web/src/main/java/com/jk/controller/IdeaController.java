package com.jk.controller;

import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import com.jk.service.HuiYuanService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
    @RequiresPermissions("idea:findIdeaPage")
    public List<Idea> findIdea(){
        return huiyuanService.findIdea();
    }

    @RequestMapping("addIdea")
    @RequiresPermissions("idea:addIdea")
    public void addIdea(Idea idea){
        huiyuanService.addIdea(idea);
    }

    @RequestMapping("deleteIdea")
    @RequiresPermissions("idea:deleteIdea")
    public void deleteIdea(Integer ideaId){
        huiyuanService.deleteById(ideaId);
    }

    @RequestMapping("findOne")
    @RequiresPermissions("idea:findOne")
    public Idea findOne(Integer ideaId){
        return huiyuanService.findIdeaById(ideaId);
    }

    @RequestMapping("findIdeaPage")
    @RequiresPermissions("idea:findIdeaPage")
    public PageResult findIdeaPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Idea idea){
        return huiyuanService.findIdeaPage(currPage,pageSize,idea);
    }

    @RequestMapping("findMesPage")
    @RequiresPermissions("idea:findMesPage")
    public PageResult findMesPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Idea idea){
        return huiyuanService.findMessagePage(currPage,pageSize,idea);
    }

    @RequestMapping("addMes")
    @RequiresPermissions("idea:addMes")
    public void addMes(Idea idea){
        huiyuanService.addMessage(idea);
    }

    @RequestMapping("deleteMesById")
    @RequiresPermissions("idea:deleteMesById")
    public void deleteMesById(Integer ideaId){
        huiyuanService.deleteMesById(ideaId);
    }

    @RequestMapping("findMesById")
    @RequiresPermissions("idea:findMesById")
    public Idea findMesById(Integer ideaId){
        return huiyuanService.findMesById(ideaId);
    }
}
