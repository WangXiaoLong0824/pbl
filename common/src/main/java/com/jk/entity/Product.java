package com.jk.entity;

import lombok.Data;

@Data
public class Product {
    private Integer productId;
    private String productNum;
    private String productName;
    private Integer productOldPrice;
    private Integer productNewPrice;
    private String productCountry;
    private String createTime;
    private Integer productStatus;
}
