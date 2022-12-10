package com.snow.service;

import com.snow.pojo.Materials;

import java.util.List;

public interface MaterialsService {
    List<Materials> selectAll();

    Integer selectLastId();

    void add(Materials materials);
    void delete(Integer id);
    Materials selectById(Integer id);
    void update(Materials materials);
}
