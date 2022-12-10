package com.snow.web.servlet.old;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONWriter;
import com.snow.pojo.Messages;
import com.snow.service.MessagesService;
import com.snow.service.impl.MessagesServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "selectAllServlet", value = "/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    private MessagesService messagesService = new MessagesServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 从数据库 获取数据
        List<Messages> messages = messagesService.selectAll();

        //2. 将数据转化为json
        String jsonString = JSON.toJSONString(messages);

        //3. 将json写入response
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
