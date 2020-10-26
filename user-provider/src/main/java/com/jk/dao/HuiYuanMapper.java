package com.jk.dao;

import com.jk.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface HuiYuanMapper {
    Long findHuiYuanLevelCount(User user);

    List<User> findHuiYuanLevel(Integer currPage, Integer pageSize, User user);
    @Select("select a.*,b.level_name levelName from user a,level b where a.level_id=b.level_id")
    List<User> findHuiYuanLevel1();
    @Delete("delete from user where user_id=#{userId}")
    void deleteHuiYuan(Integer userId);

    void addHuiYuan(User user);

    void findHuiYuanLevelById(Integer userId);

    void updateHuiYuanLevel(User user);
}
