package com.jk.service;

import com.jk.entity.Idea;
import com.jk.entity.PageResult;
import com.jk.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user-provider")
public interface HuiYuanService {
    /**
     * wxl
     * @param currPage
     * @param pageSize
     * @param user
     * @return
     */
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

    /**
     * ww
     * @return
     */
    @RequestMapping("findIdea")
    public List<Idea> findIdea();

    @RequestMapping("addIdea")
    public String addIdea(@RequestBody Idea idea);

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer ideaId);

    @RequestMapping("findIdeaById")
    public Idea findIdeaById(@RequestParam Integer ideaId);

    @RequestMapping("findIdeaPage")
    public PageResult findIdeaPage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody Idea idea);
}
