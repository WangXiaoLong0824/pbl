package com.jk.dao;

import com.jk.entity.Img;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImgMapper {
    Long findImgCount(Img img);

    List<Img> findImgPage(Integer currPage, Integer pageSize, Img img);

    void addImg(Img img);

    void deleteImgById(Integer imgId);

    Img findImgById(Integer imgId);

    void updateImg(Img img);
}
