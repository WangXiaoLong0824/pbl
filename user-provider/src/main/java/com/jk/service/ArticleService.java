package com.jk.service;

import com.jk.entity.Article;
import com.jk.entity.Idea;
import com.jk.entity.PageResult;

public interface ArticleService {
    PageResult findArticlePage(Integer currPage, Integer pageSize, Article article);

    void addArticle(Article article);

    void deleteArticleById(Integer articleId);

    Article findArticleById(Integer articleId);
}
