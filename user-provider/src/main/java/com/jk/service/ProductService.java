package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.Product;
import com.jk.entity.User;

public interface ProductService {
    PageResult findProduct(Integer currPage, Integer pageSize, Product product);

    void deleteProduct(Integer productId);

    void addProduct(Product product);

    Product findProductById(Integer productId);

    void updateProduct(Product product);
}
