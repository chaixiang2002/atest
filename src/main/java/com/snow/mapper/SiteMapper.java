package com.snow.mapper;

import com.snow.pojo.Site;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SiteMapper {
    @Select("select * from my_IT_system.AAS.Site")
    List<Site> selectAll();

    @Select("select Max(ID) from my_IT_system.AAS.Site")
    Integer selectLastId();

    @Insert("insert into my_IT_system.AAS.Site values(#{ApplicantSite},#{Borrower},#{time},#{ApplicationPurposes})")
    void add(Site site);

    @Delete("delete my_IT_system.AAS.Site where ID=#{id}")
    void delete(Integer id);

    @Update("update my_IT_system.AAS.Site set ApplicantSite=#{ApplicantSite},Borrower=#{Borrower},time=#{time},ApplicationPurposes=#{ApplicationPurposes} where ID=#{ID} ")
    void update(Site site);

    //模糊搜索
    @Select("select * from my_IT_system.AAS.Site where Borrower like #{username}")
    List<Site> selectByUsername(String username);

    @Select("select * from my_IT_system.AAS.Site where ID=#{id} ")
    Site selectById(Integer id);
}
