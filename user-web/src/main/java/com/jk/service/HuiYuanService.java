package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-provider")
public interface HuiYuanService {
    @RequestMapping("findHuiYuanLevel")
    public PageResult findHuiYuanLevel(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody User user);
    @RequestMapping("deleteHuiYuan")
    public void deleteHuiYuan(@RequestParam Integer userId);
    @RequestMapping("addHuiYuan")
    public void addHuiYuan(@RequestBody User user);
    @RequestMapping("findHuiYuanLevelById")
    public User findHuiYuanLevelById(@RequestBody Integer userId);
    @RequestMapping("updateHuiYuanLevel")
    public void updateHuiYuanLevel(@RequestBody User user);
}
