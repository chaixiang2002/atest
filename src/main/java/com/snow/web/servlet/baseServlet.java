package com.snow.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class baseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取请求路径
        String requestURI = req.getRequestURI();//URI是短路径  URL是长路径  /GDPU_IT4_war/messages/selectall
//        System.out.println(requestURI);

        //2. 从路径的最后获取方法名
        int i = requestURI.lastIndexOf('/');
        String methodName = requestURI.substring(i+1);//    i: /selectall        i+1:selectall
//        System.out.println(methodName);

        //3. 执行方法
        //3.1 获取 messagesServlet 等字节码对象Class
        // this是谁？   谁调用this,this是谁！  比如message调用service（），this就是service
//        System.out.println(this);         //com.snow.web.servlet.MessagesServlet@5f0d3ad8
        Class<? extends baseServlet> aClass = this.getClass();

        //3.2 获得方法Method对象
        try {
            Method method = aClass.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, req, resp);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
