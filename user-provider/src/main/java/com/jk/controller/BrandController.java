package com.jk.controller;


import com.jk.entity.BrandEntity;
import com.jk.entity.PageResult;
import com.jk.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BrandController {

    @Resource
    private BrandService brandService;

    @RequestMapping("findPage")
    public PageResult findPage(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody BrandEntity brand){
        return brandService.findPage(currPage,pageSize,brand);
    }

    @RequestMapping("addBrand")
    public void addBrand(@RequestBody BrandEntity brand){
        brandService.addBrand(brand);
    }


    @RequestMapping("deleteBrand")
    public void deleteBrand(@RequestParam Integer brandId){
        brandService.deleteBrand(brandId);
    }

    @RequestMapping("findOne")
    public BrandEntity findOne(@RequestParam Integer brandId){
        return brandService.findOne(brandId);
    }

    @RequestMapping("updateBrand")
    public void updateBrand(@RequestBody BrandEntity brand){
        brandService.updateBrand(brand);
    }


}
