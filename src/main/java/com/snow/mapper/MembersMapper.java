package com.snow.mapper;

import com.snow.pojo.Members;
import com.snow.pojo.Messages;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MembersMapper {
    @Select("select * from my_IT_system.AMS.Members where UserName=#{username}")
    Members selectByUsername(String username);

    @Insert("insert into my_IT_system.AMS.Members(UserName, Password, Name, Sex, Profession, Introduction, PostID, MessageBoxID) values (#{UserName},#{Password},#{Name},#{Sex},#{Profession},#{Introduction},1,3)")
    void add (Members members);

    @Select("select * from my_IT_system.AMS.Members")
    List<Members> selectAll();

    @Select("select * from my_IT_system.AMS.Members where UserName=#{username} and Password=#{password}")
    Members login(@Param("username") String username, @Param("password") String password);

}
