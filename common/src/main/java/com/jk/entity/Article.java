package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Article implements Serializable {

    private Integer articleId;
    private String articleName;
    private String articleAuthor;
    private String articleTime;
    private Integer articleStatus;
    private String articleContent;
}
