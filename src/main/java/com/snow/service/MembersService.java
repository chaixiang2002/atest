package com.snow.service;

import com.snow.pojo.Members;

import java.util.List;

public interface MembersService {
    Members selectByUsername(String username);
    void add(Members members);

    List<Members> selectAll();

    Members login(String username,String password);
}
