package com.jk.service;


import com.jk.dao.BrandMapper;
import com.jk.entity.BrandEntity;
import com.jk.entity.PageResult;
import com.jk.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{

    @Resource
    private BrandMapper brandtMapper;

    @Override
    public PageResult findPage(Integer currPage, Integer pageSize, BrandEntity brand) {
        Long total = brandtMapper.findCount(brand);
        List<Product> productList = brandtMapper.findPage(currPage,pageSize,brand);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,productList,currPage,pageSize,totalPage);
    }

    @Override
    public void addBrand(BrandEntity brand) {
        brandtMapper.addBrand(brand);
    }

    @Override
    public void deleteBrand(Integer brandId) {
        brandtMapper.deleteBrand(brandId);
    }

    @Override
    public BrandEntity findOne(Integer brandId) {
        return brandtMapper.findOne(brandId);
    }

    @Override
    public void updateBrand(BrandEntity brand) {
        brandtMapper.updateBrand(brand);
    }
}
