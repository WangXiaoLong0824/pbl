package com.jk.service;

import com.jk.dao.ShiroMapper;
import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShiroServiceImpl implements ShiroService{
    @Resource
    private ShiroMapper shiroMapper;

    @Override
    public List<String> selectPowerKeyList(Integer id) {
        return shiroMapper.selectPowerKeyList(id);
    }

    @Override
    public SysUser selectUserInfoByCode(String userCode) {
        return shiroMapper.selectUserInfoByCode(userCode);
    }

    @Override
    public List<Tree> selectTreeList(Integer userId) {
        Integer pid = 1;
        List<Tree> treeList = nodesList(pid, userId);
        return treeList;
    }

    private List<Tree> nodesList(Integer pid, Integer userId){
        List<Tree> treeList = shiroMapper.selectTreeList(pid, userId);
        for (Tree tree : treeList) {
            List<Tree> nodeList = nodesList(tree.getId(), userId);
            // 没有子节点
            if(nodeList == null || nodeList.size() <= 0) {
                tree.setSelectable(true);
                tree.setLeaf(true);
            } else {
                tree.setSelectable(false);
                tree.setNodes(nodeList);
            }
        }
        return treeList;
    }

}
