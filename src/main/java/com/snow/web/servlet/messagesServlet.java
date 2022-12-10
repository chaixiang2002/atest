package com.snow.web.servlet;

import com.alibaba.fastjson.JSON;
import com.snow.pojo.Messages;
import com.snow.service.MessagesService;
import com.snow.service.impl.MessagesServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/messages/*")
public class messagesServlet extends baseServlet{
    private MessagesService messagesService = new MessagesServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("messages  selectAll...");
        //1. 从数据库 获取数据
        List<Messages> messages = messagesService.selectAll();

        //2. 将数据转化为json
        String jsonString = JSON.toJSONString(messages);

        //3. 将json写入response
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("messages  add...");
        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();

        //转为Messages对象
        Messages messages = JSON.parseObject(params, Messages.class);

        //2. 调用service添加messages进数据库
        messagesService.add(messages);

        //3.
        response.getWriter().write("success add messages");
    }
}
