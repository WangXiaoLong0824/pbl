package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.User;
import com.jk.service.HuiYuanService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HuiYuanController {
    @Resource
    private HuiYuanService huiYuanService;
    @RequestMapping("findHuiYuanLevel")
    public PageResult findHuiYuanLevel(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody User user){
        return huiYuanService.findHuiYuanLevel(currPage,pageSize,user);
    }
    @RequestMapping("findHuiYuanLevel1")
    public List<User> findHuiYuanLevel1(){
        return huiYuanService.findHuiYuanLevel1();
    }
    @RequestMapping("deleteHuiYuan")
    public void deleteHuiYuan(@RequestParam Integer userId){
         huiYuanService.deleteHuiYuan(userId);
    }
    @RequestMapping("addHuiYuan")
    public void addHuiYuan(@RequestBody User user){
        huiYuanService.addHuiYuan(user);
    }
    @RequestMapping("findHuiYuanLevelById")
    public void findHuiYuanLevelById(@RequestBody Integer userId){
        huiYuanService.findHuiYuanLevelById(userId);
    }
    @RequestMapping("updateHuiYuanLevel")
    public void updateHuiYuanLevel(@RequestBody User user){
        huiYuanService.updateHuiYuanLevel(user);
    }
}
