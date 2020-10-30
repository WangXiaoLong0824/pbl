package com.jk.entity;

import lombok.Data;

@Data
public class LogBean {
    private Integer id;
    private String className;
    private String methodName;
    private String requestParams;
    private String responseParams;
}
