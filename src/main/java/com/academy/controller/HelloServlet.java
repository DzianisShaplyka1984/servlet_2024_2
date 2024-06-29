package com.academy.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,
                                                                       response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) {
        HttpSession session = request.getSession();

        session.setAttribute("msg", "Hello World!!!!");
    }
}
