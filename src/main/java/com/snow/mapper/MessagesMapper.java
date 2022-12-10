package com.snow.mapper;

import com.snow.pojo.Messages;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MessagesMapper {

    @Select("select * from tmp.Messages")
    List<Messages> selectAll();


    @Insert("insert into my_IT_system.tmp.Messages values (#{sender},#{Receiver},#{Content_},getdate())")
    void add(Messages messages);

    void deleteByIds(int[] ids);

    @Select("select * from my_IT_system.tmp.Messages limit #{begin},#{size}")
    List<Messages> selectByPage(int begin,int size);
}
