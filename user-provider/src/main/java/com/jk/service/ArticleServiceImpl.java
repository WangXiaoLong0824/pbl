package com.jk.service;

import com.jk.dao.ArticleMapper;
import com.jk.entity.Article;
import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public PageResult findArticlePage(Integer currPage, Integer pageSize, Article article) {
        Long total = articleMapper.findArticleCount(article);
        List<Article> articleList = articleMapper.findArticlePage(currPage,pageSize,article);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,articleList,currPage,pageSize,totalPage);
    }

    @Override
    public void addArticle(Article article) {
        if (article.getArticleId() == null){
            articleMapper.addArticle(article);
        }else{
            articleMapper.updateArticle(article);
        }

    }

    @Override
    public void deleteArticleById(Integer articleId) {
        articleMapper.deleteArticleById(articleId);
    }

    @Override
    public Article findArticleById(Integer articleId) {
        return articleMapper.findArticleById(articleId);
    }
}
