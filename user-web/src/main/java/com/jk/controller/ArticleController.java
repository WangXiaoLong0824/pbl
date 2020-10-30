package com.jk.controller;

import com.jk.entity.Article;
import com.jk.entity.PageResult;
import com.jk.service.HuiYuanService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("article")
public class ArticleController {

    @Resource
    private HuiYuanService huiyuanService;

    @RequestMapping("findArticlePage")
    public PageResult findArticlePage(@RequestParam(value= "currPage" ,defaultValue= "1") Integer currPage, @RequestParam(value= "pageSize" ,defaultValue= "10") Integer pageSize, Article article){
        return huiyuanService.findArticlePage(currPage,pageSize,article);
    }

    @RequestMapping("addArticle")
    public void addArticle(Article article){
        huiyuanService.addArticle(article);
    }

    @RequestMapping("deleteArticleById")
    public void deleteArticleById(Integer articleId){
        huiyuanService.deleteArticleById(articleId);
    }

    @RequestMapping("findArticleById")
    public Article findArticleById(Integer articleId){
        return huiyuanService.findArticleById(articleId);
    }
}
