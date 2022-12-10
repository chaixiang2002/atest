package com.snow.web.servlet;

import com.alibaba.fastjson.JSON;
import com.snow.pojo.Members;
import com.snow.pojo.Messages;
import com.snow.service.MessagesService;
import com.snow.service.impl.MembersServiceImpl;
import com.snow.service.impl.MessagesServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/members/*")
public class membersServlet extends baseServlet{
    MembersServiceImpl membersService = new MembersServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1. 从数据库 获取数据


        //2. 将数据转化为json


        //3. 将json写入response

    }

    /**
     * 检验用户名是否已存在
     * @param request
     * @param response
     * @throws
     * @throws IOException
     */
    public void userNameVerification(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();
        Members members = membersService.selectByUsername(params);

        response.setContentType("text/json;charset=utf-8");

        if(members==null){
            response.getWriter().write("该用户不存在！");
        }else {
            //2. 将数据转化为json
            String jsonString = JSON.toJSONString(members.getID());

            //3. 将json写入response
            response.getWriter().write(jsonString);
        }

    }
    public void userNameIsExist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();
        Members members = membersService.selectByUsername(params);

        response.setContentType("text/json;charset=utf-8");

        if(members==null){
            response.getWriter().write("该用户不存在！");
        }else {
            //3. 将json写入response
            response.getWriter().write("已识别该用户！");
        }

    }


    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();


        //转为Messages对象
        Members members = JSON.parseObject(params, Members.class);


        //2. 调用service添加messages进数据库
        membersService.add(members);


        //3.
        response.getWriter().write("success");
    }
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();
        System.out.println(params);


        //转为Messages对象
        Members members = JSON.parseObject(params, Members.class);
        System.out.println(members);


        //2. 调用service添加messages进数据库
        Members login = membersService.login(members.getUserName(), members.getPassword());
        System.out.println("ok");


        //3.
        if(login==null){
            response.getWriter().write("failed");
        }else{
            response.getWriter().write("success");
        }
    }
}
