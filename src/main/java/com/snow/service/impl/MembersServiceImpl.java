package com.snow.service.impl;

import com.snow.mapper.MembersMapper;
import com.snow.pojo.Members;
import com.snow.pojo.Messages;
import com.snow.service.MembersService;
import com.snow.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class MembersServiceImpl implements MembersService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public Members selectByUsername(String username) {
        System.out.println("MembersService  ,username");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        MembersMapper mapper = sqlSession.getMapper(MembersMapper.class);
        System.out.println("MembersService  ,username");

        Members members = mapper.selectByUsername(username);
        System.out.println("MembersService  ,username");

        sqlSession.close();
        return members;
    }

    @Override
    public void add(Members members) {
        System.out.println("MembersService  ...");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        MembersMapper mapper = sqlSession.getMapper(MembersMapper.class);
        System.out.println("MembersService  ...11");

        mapper.add(members);
        System.out.println("MembersService  ...22");

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Members> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MembersMapper mapper = sqlSession.getMapper(MembersMapper.class);
        List<Members> members = mapper.selectAll();
        sqlSession.close();
        return members;
    }

    @Override
    public Members login(String username, String password) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MembersMapper mapper = sqlSession.getMapper(MembersMapper.class);
        System.out.println("MembersService  ,username");

        Members members = mapper.login(username,password);
        sqlSession.close();
        return members;
    }


}
