package com.jk.dao;

import com.jk.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ProductMapper {
    Long findProductCount(Product product);

    List<Product> findProduct(Integer currPage, Integer pageSize, Product product);
    @Delete("delete from product where product_id=#{productId}")
    void deleteProduct(Integer productId);
    @Insert("insert into product values(#{productId},#{productNum},#{productName},#{productOldPrice},#{productNewPrice},#{productCountry},#{createTime},#{productStatus})")
    void addProduct(Product product);
    @Select("select * from product where product_id=#{productId}")
    Product findProductById(Integer productId);
    @Update("update product set product_name=#{productName},product_old_price=#{productOldPrice},product_new_price=#{productNewPrice},product_country=#{productCountry},create_time=#{createTime},product_status=#{productStatus} where product_id=#{productId}")
    void updateProduct(Product product);
}
