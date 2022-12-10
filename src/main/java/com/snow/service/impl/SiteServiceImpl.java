package com.snow.service.impl;

import com.snow.mapper.SiteMapper;
import com.snow.pojo.Site;
import com.snow.service.SiteService;
import com.snow.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class SiteServiceImpl implements SiteService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Site> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> sites = mapper.selectAll();
        sqlSession.close();
        return sites;
    }

    @Override
    public Integer selectLastId() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        Integer lastId = mapper.selectLastId();
        sqlSession.close();
        return lastId;
    }

    @Override
    public void add(Site site) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        mapper.add(site);
        sqlSession.commit();//////////////////////////
        sqlSession.close();
    }

    @Override
    public void delete(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        mapper.delete(id);
        sqlSession.commit();///////////////////////
        sqlSession.close();
    }

    @Override
    public void update(Site site) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        mapper.update(site);
        sqlSession.commit();/////////
        sqlSession.close();
    }

    @Override
    public List<Site> selectByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> sites = mapper.selectByUsername("%"+username+"%" );
        sqlSession.close();
        return sites;
    }

    @Override
    public Site selectById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        Site site = mapper.selectById(id);
        sqlSession.close();
        return site;
    }
}
