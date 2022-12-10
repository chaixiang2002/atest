package com.snow.service.impl;

import com.snow.mapper.ExpenditureMapper;
import com.snow.pojo.Expenditure;
import com.snow.service.ExpenditureService;
import com.snow.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ExpenditureServiceImpl implements ExpenditureService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public void add(Expenditure expenditure) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExpenditureMapper mapper = sqlSession.getMapper(ExpenditureMapper.class);
        mapper.add(expenditure);
        sqlSession.commit();//////
        sqlSession.close();
    }

    @Override
    public void delete(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExpenditureMapper mapper = sqlSession.getMapper(ExpenditureMapper.class);
        mapper.delete(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Expenditure expenditure) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExpenditureMapper mapper = sqlSession.getMapper(ExpenditureMapper.class);
        mapper.update(expenditure);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Expenditure> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExpenditureMapper mapper = sqlSession.getMapper(ExpenditureMapper.class);
        List<Expenditure> expenditures = mapper.selectAll();
        sqlSession.close();
        return expenditures;
    }

    @Override
    public Expenditure selectById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExpenditureMapper mapper = sqlSession.getMapper(ExpenditureMapper.class);
        Expenditure expenditure = mapper.selectById(id);
        sqlSession.close();
        return expenditure;
    }

    @Override
    public Integer selectLastId() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExpenditureMapper mapper = sqlSession.getMapper(ExpenditureMapper.class);
        Integer lastId = mapper.selectLastId();
        sqlSession.close();
        return lastId;
    }
}
