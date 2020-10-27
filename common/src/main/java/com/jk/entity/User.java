package com.jk.entity;

import lombok.Data;

@Data
public class User {

    private Integer userId;

    private String userName;

    private Integer userSex;

    private String userPhone;

    private String userEmail;

    private String createTime;

    private String userJiFen;

    private Integer levelId;

    private String userStatus;

    //业务
    private String levelName;



}
