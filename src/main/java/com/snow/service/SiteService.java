package com.snow.service;

import com.snow.pojo.Site;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SiteService {
    List<Site> selectAll();

    Integer selectLastId();

    void add(Site site);

    void delete(Integer id);

    void update(Site site);

    //模糊搜索
    List<Site> selectByUsername(String username);

    Site selectById(Integer id);
}
