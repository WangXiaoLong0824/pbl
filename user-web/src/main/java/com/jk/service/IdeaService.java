package com.jk.service;

import com.jk.entity.Idea;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user-provider")
public interface IdeaService{

    @RequestMapping("findIdea")
    public List<Idea> findIdea();

    @RequestMapping("addIdea")
    public String addIdea(@RequestBody Idea idea);

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer ideaId);

    @RequestMapping("findIdeaById")
    public Idea findIdeaById(@RequestParam Integer ideaId);
}
