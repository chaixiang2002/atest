package com.snow.service;

import com.snow.pojo.Expenditure;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ExpenditureService {
    void add(Expenditure expenditure);

    void delete(Integer id);

    void update(Expenditure expenditure);

    List<Expenditure> selectAll();

    Expenditure selectById(Integer id);

    Integer selectLastId();
}
