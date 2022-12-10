package com.snow.web.servlet.old;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.snow.pojo.Messages;
import com.snow.service.MessagesService;
import com.snow.service.impl.MessagesServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "addMessagesServlet", value = "/addMessagesServlet")
public class addMessagesServlet extends HttpServlet {
    private MessagesService messagesService = new MessagesServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接受前端传来的json数据
        BufferedReader bufferedReader = request.getReader();
        String params= bufferedReader.readLine();

        //转为Messages对象
        Messages messages = JSON.parseObject(params, Messages.class);

        //2. 调用service添加messages进数据库
        messagesService.add(messages);

        //3.
        response.getWriter().write("success add messages");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
