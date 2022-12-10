package com.snow.service.impl;

import com.snow.mapper.MaterialsMapper;
import com.snow.pojo.Materials;
import com.snow.service.MaterialsService;
import com.snow.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class MaterialsServiceImpl implements MaterialsService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Materials> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MaterialsMapper mapper = sqlSession.getMapper(MaterialsMapper.class);
        List<Materials> materials = mapper.selectAll();
        sqlSession.close();
        return materials;
    }

    @Override
    public Integer selectLastId() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MaterialsMapper mapper = sqlSession.getMapper(MaterialsMapper.class);
        Integer id = mapper.selectLastId();
        sqlSession.close();
        return id;
    }

    @Override
    public void add(Materials materials) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MaterialsMapper mapper = sqlSession.getMapper(MaterialsMapper.class);
        mapper.add(materials);
        sqlSession.commit();///////////////////////
        sqlSession.close();
    }

    @Override
    public void delete(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MaterialsMapper mapper = sqlSession.getMapper(MaterialsMapper.class);
        mapper.delete(id);
        sqlSession.commit();///////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        sqlSession.close();
    }

    @Override
    public Materials selectById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MaterialsMapper mapper = sqlSession.getMapper(MaterialsMapper.class);
        Materials materials = mapper.selectById(id);
        return materials;
    }

    @Override
    public void update(Materials materials) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MaterialsMapper mapper = sqlSession.getMapper(MaterialsMapper.class);
        mapper.update(materials);
        sqlSession.commit();
        sqlSession.close();

    }
}
