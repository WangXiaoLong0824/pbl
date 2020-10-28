package com.jk.dao;

import com.jk.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface HuiYuanMapper {
    Long findHuiYuanLevelCount(@Param("user") User user);

    List<User> findHuiYuanLevel(@Param("currPage")Integer currPage,@Param("pageSize") Integer pageSize,@Param("user") User user);
    @Select("select a.*,b.level_name levelName from user a,level b where a.level_id=b.level_id")
    List<User> findHuiYuanLevel1();
    @Delete("delete from user where user_id=#{userId}")
    void deleteHuiYuan(Integer userId);
    @Insert("insert into user values(#{userId},#{userName},#{userSex},#{userPhone},#{userEmail},#{createTime},#{userJiFen},#{levelId},#{userStatus})")
    void addHuiYuan(User user);
    @Select("select a.*,b.level_name levelName from user a,level b where a.level_id=b.level_id and a.user_id=#{userId}")
    User findHuiYuanLevelById(Integer userId);
    @Update("update user set user_name=#{userName},user_sex=#{userSex},user_phone=#{userPhone},user_email=#{userEmail},create_time=#{createTime},user_jifen=#{userJiFen},level_id=#{levelId},user_status=#{userStatus} where user_id=#{userId}")
    void updateHuiYuanLevel(User user);
}
