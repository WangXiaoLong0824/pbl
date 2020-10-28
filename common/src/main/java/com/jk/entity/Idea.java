package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Idea implements Serializable {

    private Integer ideaId;

    private String ideaName;

    private String ideaPhone;

    private String ideaEmail;

    private String ideaContent;

    private String ideaTime;

    private Integer statusId;

    private Integer typeId;
}
