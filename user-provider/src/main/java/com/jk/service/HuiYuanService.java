package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.User;

import java.util.List;

public interface HuiYuanService {
    PageResult findHuiYuanLevel(Integer currPage, Integer pageSize, User user);

    List<User> findHuiYuanLevel1();

    void deleteHuiYuan(Integer userId);

    void addHuiYuan(User user);

    void findHuiYuanLevelById(Integer userId);

    void updateHuiYuanLevel(User user);
}
