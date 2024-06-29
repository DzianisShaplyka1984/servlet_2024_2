package com.academy.controller;

import com.academy.model.User;
import com.academy.service.AuthService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        AuthService authService = new AuthService();

        if (authService.checkCredentials(login, password)) {

            User user = new User(login, password);

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("user", user);

            out.println("Hello " + login);

        } else {
            out.println("Access denied");
        }
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
