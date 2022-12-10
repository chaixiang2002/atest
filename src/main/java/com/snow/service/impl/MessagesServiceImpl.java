package com.snow.service.impl;

import com.snow.mapper.MessagesMapper;
import com.snow.pojo.Messages;
import com.snow.service.MessagesService;
import com.snow.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class MessagesServiceImpl implements MessagesService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Messages> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MessagesMapper mapper = sqlSession.getMapper(MessagesMapper.class);
        List<Messages> messages = mapper.selectAll();
        sqlSession.close();

        return messages;
    }

    @Override
    public void add(Messages messages) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MessagesMapper mapper = sqlSession.getMapper(MessagesMapper.class);
        mapper.add(messages);
        sqlSession.commit();
        sqlSession.close();
    }
}
