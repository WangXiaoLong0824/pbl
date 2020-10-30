package com.jk.dao;

import com.jk.entity.Article;
import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {


    Long findArticleCount(@Param("article") Article article);

    List<Article> findArticlePage(@Param("currPage") Integer currPage,@Param("pageSize")Integer pageSize,@Param("article")Article article);

    void addArticle(Article article);

    void deleteArticleById(Integer articleId);

    Article findArticleById(Integer articleId);

    void updateArticle(Article article);
}
