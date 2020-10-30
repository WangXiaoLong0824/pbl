package com.jk.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class LogBean {
    private String id;
    private String className;
    private String methodName;
    private String requestParams;
    private String responseParams;
}
