package com.jk.service;

import com.jk.entity.Idea;
import com.jk.entity.PageResult;

import java.util.List;

public interface IdeaService {
    List<Idea> findIdea();

    void addIdea(Idea idea);

    void deleteById(Integer ideaId);

    Idea findIdeaById(Integer ideaId);

    PageResult findIdeaPage(Integer currPage, Integer pageSize, Idea idea);
}
