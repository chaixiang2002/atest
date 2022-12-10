package com.snow.service;

import com.snow.pojo.Members;
import com.snow.pojo.Messages;

import java.util.List;

public interface MessagesService {
    List<Messages> selectAll();

    void add(Messages messages);


}
