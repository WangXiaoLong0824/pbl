package com.jk.service;

import com.jk.entity.SysUser;
import com.jk.entity.Tree;

import java.util.List;

public interface ShiroService {
    List<String> selectPowerKeyList(Integer id);

    SysUser selectUserInfoByCode(String userCode);

    List<Tree> selectTreeList(Integer id);
}
