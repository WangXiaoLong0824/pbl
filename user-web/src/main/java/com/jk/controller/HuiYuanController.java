package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.User;
import com.jk.service.HuiYuanService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("huiYuan")
public class HuiYuanController {
    @Resource
    private HuiYuanService huiYuanService;
    @RequestMapping("findHuiYuanLevel")
    @RequiresPermissions("huiYuanLevel:findHuiYuanLevel")
    public PageResult findHuiYuanLevel(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, User user){
        return huiYuanService.findHuiYuanLevel(currPage,pageSize,user);
    }
    @RequestMapping("deleteHuiYuan")
    @RequiresPermissions("huiYuanLevel:deleteHuiYuan")
    public void deleteHuiYuan( Integer userId){
        huiYuanService.deleteHuiYuan(userId);
    }
    @RequestMapping("addHuiYuan")
    @RequiresPermissions("huiYuanLevel:addHuiYuan")
    public void addHuiYuan( User user){
        huiYuanService.addHuiYuan(user);
    }
    @RequestMapping("findHuiYuanLevelById")
    @RequiresPermissions("huiYuanLevel:findHuiYuanLevelById")
    public User findHuiYuanLevelById( Integer userId){
        return huiYuanService.findHuiYuanLevelById(userId);
    }
    @RequestMapping("updateHuiYuanLevel")
    public void updateHuiYuanLevel( User user){
        huiYuanService.updateHuiYuanLevel(user);
    }
}
