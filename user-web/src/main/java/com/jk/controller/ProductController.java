package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Product;
import com.jk.service.HuiYuanService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("product")
public class ProductController {
    @Resource
    private HuiYuanService huiYuanService;
    @RequestMapping("findProduct")
    @RequiresPermissions("product:findProduct")
    public PageResult findProduct(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, Product product){
        return huiYuanService.findProduct(currPage,pageSize,product);
    }
    @RequestMapping("deleteProduct")
    @RequiresPermissions("product:deleteProduct")
    public void deleteProduct( Integer productId){
        huiYuanService.deleteProduct(productId);
    }
    @RequestMapping("addProduct")
    @RequiresPermissions("product:addProduct")
    public void addProduct( Product product){
        huiYuanService.addProduct(product);
    }
    @RequestMapping("findProductById")
    @RequiresPermissions("product:findProductById")
    public Product findProductById( Integer productId){
        return huiYuanService.findProductById(productId);
    }
    @RequestMapping("updateProduct")
    public void updateProduct( Product product){
        huiYuanService.updateProduct(product);
    }
}
