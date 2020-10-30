package com.jk.dao;

import com.jk.entity.BrandEntity;
import com.jk.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BrandMapper {

    Long findCount(BrandEntity brand);

    List<Product> findPage(Integer currPage, Integer pageSize, BrandEntity brand);
    @Insert("insert into t_brand values(#{brandId},#{brandName},#{miaoShu},now(),#{order},#{status}")
    void addBrand(BrandEntity brand);
    @Delete("delete from t_brand where brand_id=#{brandId}")
    void deleteBrand(Integer brandId);
    @Select("select * from t_brand where brand_id=#{brandId}")
    BrandEntity findOne(Integer brandId);
    @Update("update t_brand set brand_name=#{beandName},mianshu=#[miaoShu},createtime=now(),order=#{order},#status=#{status} where brand_id=#{brandId}")
    void updateBrand(BrandEntity brand);
}
