package com.jk.controller;

import com.jk.entity.Idea;
import com.jk.service.IdeaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IdeaController {

    @Resource
    private IdeaService ideaService;

    @RequestMapping("findIdea")
    public List<Idea> findIdea(){
        return ideaService.findIdea();
    }

    @RequestMapping("addIdea")
    public void addIdea(Idea idea){
        ideaService.addIdea(idea);
    }

    @RequestMapping("deleteIdea")
    public void deleteIdea(Integer ideaId){
        ideaService.deleteById(ideaId);
    }

    @RequestMapping("findOne")
    public Idea findOne(Integer ideaId){
        return ideaService.findIdeaById(ideaId);
    }
}
