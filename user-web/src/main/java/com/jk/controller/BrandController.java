package com.jk.controller;

import com.jk.entity.BrandEntity;
import com.jk.entity.PageResult;
import com.jk.entity.Product;
import com.jk.service.HuiYuanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Resource
    private HuiYuanService huiYuanService;

    @RequestMapping("findPage")
    public PageResult findPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, BrandEntity brand){
        return huiYuanService.findPage(currPage,pageSize,brand);
    }

    @RequestMapping("addBrand")
    public void addBrand(BrandEntity brand){
        huiYuanService.addBrand(brand);
    }


    @RequestMapping("deleteBrand")
    public void deleteBrand( Integer brandId){
        huiYuanService.deleteBrand(brandId);
    }


    @RequestMapping("findOne")
    public BrandEntity findOne( Integer brandId){
        return huiYuanService.findOne(brandId);
    }

    @RequestMapping("updateBrand")
    public void updateBrand(BrandEntity brand){
        huiYuanService.updateBrand(brand);
    }
}
