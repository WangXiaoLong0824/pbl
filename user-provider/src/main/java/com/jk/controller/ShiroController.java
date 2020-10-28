package com.jk.controller;

import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import com.jk.service.ShiroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ShiroController {
    @Resource
    private ShiroService shiroService;

    @RequestMapping("selectPowerKeyList")
    public List<String> selectPowerKeyList(@RequestParam Integer id){
        return shiroService.selectPowerKeyList(id);
    }
    @RequestMapping("selectUserInfoByCode")
    public SysUser selectUserInfoByCode(@RequestParam String userCode){
        return shiroService.selectUserInfoByCode(userCode);
    }
    @RequestMapping("selectTreeList")
    public List<Tree> selectTreeList(@RequestParam Integer id){
        return shiroService.selectTreeList(id);
    }
}
