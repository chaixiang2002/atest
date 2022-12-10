package com.snow.service.impl;

import com.snow.mapper.ActivityMapper;
import com.snow.pojo.Activity;
import com.snow.service.ActivityService;
import com.snow.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ActivityServiceImpl implements ActivityService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public void add(Activity activity) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ActivityMapper mapper = sqlSession.getMapper(ActivityMapper.class);
        mapper.add(activity);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Activity> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ActivityMapper mapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activities = mapper.selectAll();
        sqlSession.close();
        return activities;
    }
}
