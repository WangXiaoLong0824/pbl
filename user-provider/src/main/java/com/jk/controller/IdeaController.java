package com.jk.controller;

import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import com.jk.service.IdeaService;
import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IdeaController {

    @Resource
    private IdeaService ideaService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("findIdea")
    public List<Idea> findIdea(){
        return ideaService.findIdea();
    }

    /**
     * 新增
     * @param idea
     * @return
     */
    @RequestMapping("addIdea")
    public String addIdea(@RequestBody Idea idea){
        ideaService.addIdea(idea);
        return "success";
    }

    /**
     * 删除
     * @param ideaId
     * @return
     */
    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer ideaId){
        ideaService.deleteById(ideaId);
        return "success";
    }

    /**
     * 回显
     * @param ideaId
     * @return
     */
    @RequestMapping("findIdeaById")
    public Idea findIdeaById(@RequestParam Integer ideaId){
        return ideaService.findIdeaById(ideaId);
    }

    /**
     * 分页
     * @param currPage
     * @param pageSize
     * @param idea
     * @return
     */
    @RequestMapping("findIdeaPage")
    public PageResult findIdeaPage(@RequestParam(value="currPage",defaultValue="1") Integer currPage,@RequestParam(value="pageSize",defaultValue="10") Integer pageSize,@RequestBody Idea idea){
        return ideaService.findIdeaPage(currPage,pageSize,idea);
    }

}
