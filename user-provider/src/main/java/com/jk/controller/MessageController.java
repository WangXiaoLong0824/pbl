package com.jk.controller;

import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import com.jk.service.IdeaService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MessageController {

    @Resource
    private IdeaService ideaService;

    @RequestMapping("findMessagePage")
    public PageResult findMessagePage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody Idea idea){
        return ideaService.findMessagePage(currPage,pageSize,idea);
    }

    @RequestMapping("addMessage")
    public String addMessage(@RequestBody Idea idea){
        ideaService.addMessage(idea);
        return "success";
    }

    @RequestMapping("deleteMesById")
    public String deleteMesById(@RequestParam Integer ideaId){
        ideaService.deleteMesById(ideaId);
        return "success";
    }

    @RequestMapping("findMesById")
    public Idea findMesById(@RequestParam Integer ideaId){
        return ideaService.findMesById(ideaId);
    }
}
