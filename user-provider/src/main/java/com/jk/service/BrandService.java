package com.jk.service;

import com.jk.entity.BrandEntity;
import com.jk.entity.PageResult;
import com.jk.entity.Product;

public interface BrandService {
    PageResult findPage(Integer currPage, Integer pageSize, BrandEntity brand);

    void addBrand(BrandEntity brand);

    void deleteBrand(Integer brandId);

    BrandEntity findOne(Integer brandId);

    void updateBrand(BrandEntity brand);
}
