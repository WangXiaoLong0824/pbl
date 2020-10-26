package com.jk.service;

import com.jk.entity.Idea;
import com.jk.mapper.IdeaMapper;
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
}
