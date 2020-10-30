package com.jk.controller;

import com.jk.entity.Article;
import com.jk.entity.PageResult;
import com.jk.service.ArticleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("findArticlePage")
    public PageResult findArticlePage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,@RequestBody Article article){
        return articleService.findArticlePage(currPage,pageSize,article);
    }

    @RequestMapping("addArticle")
    public String addArticle(@RequestBody Article article){
        articleService.addArticle(article);
        return "success";
    }

    @RequestMapping("deleteArticleById")
    public String deleteArticleById(@RequestParam Integer articleId){
        articleService.deleteArticleById(articleId);
        return "success";
    }

    @RequestMapping("findArticleById")
    public Article findArticleById(@RequestParam Integer articleId){
        return articleService.findArticleById(articleId);
    }
}
