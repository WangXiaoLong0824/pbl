package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Product;
import com.jk.service.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProductController {
    @Resource
    private ProductService productService;
    @RequestMapping("findProduct")
    public PageResult findProduct(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody Product product){
        return productService.findProduct(currPage,pageSize,product);
    }
    @RequestMapping("deleteProduct")
    public void deleteProduct(@RequestParam Integer productId){
        productService.deleteProduct(productId);
    }
    @RequestMapping("addProduct")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @RequestMapping("findProductById")
    public Product findProductById(@RequestParam Integer productId){
        return productService.findProductById(productId);
    }
    @RequestMapping("updateProduct")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
}
