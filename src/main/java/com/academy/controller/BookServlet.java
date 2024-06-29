package com.academy.controller;

import com.academy.model.Book;
import com.academy.service.BookService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        BookService bookService = new BookService();

        Book book = bookService.getById(Integer.valueOf(id));

        request.setAttribute("book", book);

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("book", book);

        request.getRequestDispatcher("/WEB-INF/jsp/book.jsp").forward(request, response);
    }
}
