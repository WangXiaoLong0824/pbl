package com.jk.dao;

import com.jk.entity.Idea;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdeaMapper {
    List<Idea> findIdea();

    void addIdea(Idea idea);

    void deleteById(Integer ideaId);

    Idea findIdeaById(Integer ideaId);

    void updateIdea(Idea idea);

    Long findIdeaCount(Idea idea);

    List<Idea> findIdeaPage(Integer currPage, Integer pageSize, Idea idea);
}
