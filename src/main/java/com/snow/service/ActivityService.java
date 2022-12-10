package com.snow.service;

import com.snow.pojo.Activity;

import java.util.List;

public interface ActivityService {

    void add(Activity activity);

    List<Activity> selectAll();
}
