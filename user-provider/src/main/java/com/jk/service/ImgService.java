package com.jk.service;

import com.jk.entity.Img;
import com.jk.entity.PageResult;

public interface ImgService {
    PageResult findImgPage(Integer currPage, Integer pageSize, Img img);

    void addImg(Img img);

    void deleteImgById(Integer imgId);

    Img findImgById(Integer imgId);
}
