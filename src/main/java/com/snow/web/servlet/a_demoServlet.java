package com.snow.web.servlet;

import com.snow.service.impl.MaterialsServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/demo/*")
public class a_demoServlet extends baseServlet{
    private MaterialsServiceImpl materialsService = new MaterialsServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public void selectById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
