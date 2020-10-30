package com.jk.service;

import com.jk.dao.ImgMapper;
import com.jk.entity.Idea;
import com.jk.entity.Img;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImgServiceImpl implements ImgService{

    @Resource
    private ImgMapper imgMapper;

    @Override
    public PageResult findImgPage(Integer currPage, Integer pageSize, Img img) {
        Long total = imgMapper.findImgCount(img);
        List<Img> imgList = imgMapper.findImgPage(currPage,pageSize,img);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,imgList,currPage,pageSize,totalPage);
    }

    @Override
    public void addImg(Img img) {
        if (img.getImgId() == null){
            imgMapper.addImg(img);
        }else{
            imgMapper.updateImg(img);
        }

    }

    @Override
    public void deleteImgById(Integer imgId) {
        imgMapper.deleteImgById(imgId);
    }

    @Override
    public Img findImgById(Integer imgId) {
        return imgMapper.findImgById(imgId);
    }
}
