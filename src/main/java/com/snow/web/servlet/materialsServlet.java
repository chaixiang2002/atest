package com.snow.web.servlet;

import com.alibaba.fastjson.JSON;
import com.snow.pojo.Materials;
import com.snow.pojo.Members;
import com.snow.service.impl.MaterialsServiceImpl;
import com.snow.service.impl.MembersServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/materials/*")
public class materialsServlet extends baseServlet{
    private MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
//    private MembersServiceImpl membersService = new MembersServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();


        //转为Messages对象
        Materials materials = JSON.parseObject(params, Materials.class);


        //2. 调用service添加messages进数据库
        Integer lastId = materialsService.selectLastId();//添加前lastID
        materialsService.add(materials);
        Materials materials1 = materialsService.selectById(lastId+1);//查看是否存在lastID+1

        //3.
        if(materials1!=null){//查看是否添加成功
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
