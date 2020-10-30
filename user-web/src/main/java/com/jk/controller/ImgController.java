package com.jk.controller;

import com.jk.entity.Img;
import com.jk.entity.PageResult;
import com.jk.service.HuiYuanService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("img")
public class ImgController {

    @Resource
    private HuiYuanService huiyuanService;

    @RequestMapping("findImgPage")
    public PageResult findImgPage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,Img img){
        return huiyuanService.findImgPage(currPage,pageSize,img);
    }

    @RequestMapping("addImg")
    public void addImg(Img img){
        huiyuanService.addImg(img);
    }

    @RequestMapping("deleteImgById")
    public void deleteImgById(Integer imgId){
        huiyuanService.deleteImgById(imgId);
    }

    @RequestMapping("findImgById")
    public Img findImgById(Integer imgId){
        return huiyuanService.findImgById(imgId);
    }
}
