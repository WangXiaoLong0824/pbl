package com.jk.service;

import com.jk.entity.Idea;
import com.jk.dao.IdeaMapper;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IdeaServiceImpl implements IdeaService{

    @Resource
    private IdeaMapper ideaMapper;

    @Override
    public List<Idea> findIdea() {
        return ideaMapper.findIdea();
    }

    @Override
    public void addIdea(Idea idea) {
        if (idea.getIdeaId() == null){
            ideaMapper.addIdea(idea);
        }else{
            ideaMapper.updateIdea(idea);
        }
    }

    @Override
    public void deleteById(Integer ideaId) {
        ideaMapper.deleteById(ideaId);
    }

    @Override
    public Idea findIdeaById(Integer ideaId) {
        return ideaMapper.findIdeaById(ideaId);
    }

    @Override
    public PageResult findIdeaPage(Integer currPage, Integer pageSize, Idea idea) {
        Long total = ideaMapper.findIdeaCount(idea);
        List<Idea> ideaList = ideaMapper.findIdeaPage(currPage,pageSize,idea);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,ideaList,currPage,pageSize,totalPage);
    }
}
