package com.jk.entity;

import lombok.Data;

@Data
public class BrandEntity {

    private Integer brandId;
    private String brandName;
    private String miaoShu;
    private String createTime;
    private Integer order;
    private Integer status;

}
