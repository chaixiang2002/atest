package com.snow.mapper;

import com.snow.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ActivityMapper {

    @Insert("insert into my_IT_system.AAS.Activity values (#{name},#{organizationName},#{time},#{materialsID},#{siteID},#{expenditureID},#{groupID},#{content})")
    void add(Activity activity);

    @Select("select * from my_IT_system.AAS.Activity")
    List<Activity> selectAll();
}
