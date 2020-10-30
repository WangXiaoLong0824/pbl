package com.jk.controller;

import com.jk.entity.Article;
import com.jk.entity.Img;
import com.jk.entity.PageResult;
import com.jk.service.ImgService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ImgController {

    @Resource
    private ImgService imgService;

    @RequestMapping("findImgPage")
    public PageResult findImgPage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody Img img){
        return imgService.findImgPage(currPage,pageSize,img);
    }

    @RequestMapping("addImg")
    public void addImg(@RequestBody Img img){
        imgService.addImg(img);
    }

    @RequestMapping("deleteImgById")
    public void deleteImgById(@RequestParam Integer imgId){
        imgService.deleteImgById(imgId);
    }

    @RequestMapping("findImgById")
    public Img findImgById(@RequestParam Integer imgId){
        return imgService.findImgById(imgId);
    }
}
