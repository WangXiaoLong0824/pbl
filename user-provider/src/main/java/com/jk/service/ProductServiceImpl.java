package com.jk.service;

import com.jk.dao.ProductMapper;
import com.jk.entity.PageResult;
import com.jk.entity.Product;
import com.jk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Resource
    private ProductMapper productMapper;
    @Override
    public PageResult findProduct(Integer currPage, Integer pageSize, Product product) {
        Long total = productMapper.findProductCount(product);
        List<Product> productList = productMapper.findProduct(currPage,pageSize,product);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,productList,currPage,pageSize,totalPage);
    }

    @Override
    public void deleteProduct(Integer productId) {
        productMapper.deleteProduct(productId);
    }

    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public Product findProductById(Integer productId) {
        return productMapper.findProductById(productId);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }
}
