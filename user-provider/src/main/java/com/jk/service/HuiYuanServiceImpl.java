package com.jk.service;

import com.jk.dao.HuiYuanMapper;
import com.jk.entity.PageResult;
import com.jk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HuiYuanServiceImpl implements HuiYuanService{
    @Resource
    private HuiYuanMapper huiYuanMapper;
    @Override
    public PageResult findHuiYuanLevel(Integer currPage, Integer pageSize, User user) {
        Long total = huiYuanMapper.findHuiYuanLevelCount(user);
        List<User> userList = huiYuanMapper.findHuiYuanLevel(currPage,pageSize,user);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,userList,currPage,pageSize,totalPage);
    }

    @Override
    public List<User> findHuiYuanLevel1() {
        return huiYuanMapper.findHuiYuanLevel1();
    }

    @Override
    public void deleteHuiYuan(Integer userId) {
        huiYuanMapper.deleteHuiYuan(userId);
    }

    @Override
    public void addHuiYuan(User user) {
        huiYuanMapper.addHuiYuan(user);
    }

    @Override
    public void findHuiYuanLevelById(Integer userId) {
        huiYuanMapper.findHuiYuanLevelById(userId);
    }

    @Override
    public void updateHuiYuanLevel(User user) {
        huiYuanMapper.updateHuiYuanLevel(user);
    }
}
