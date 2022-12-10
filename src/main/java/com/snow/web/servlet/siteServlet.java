package com.snow.web.servlet;

import com.alibaba.fastjson.JSON;
import com.snow.pojo.Site;
import com.snow.service.impl.SiteServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/site/*")
public class siteServlet extends baseServlet{
    private SiteServiceImpl siteService = new SiteServiceImpl();


    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        String line = reader.readLine();

        Site site = JSON.parseObject(line, Site.class);

        Integer lastId = siteService.selectLastId();
        siteService.add(site);
        Site site1 = siteService.selectById(lastId+1);

        if(site1!=null){
            response.getWriter().write("success");
        }else {
            response.getWriter().write("failed");
        }

    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public void selectById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
