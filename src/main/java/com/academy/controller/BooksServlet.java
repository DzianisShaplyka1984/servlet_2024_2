package com.academy.controller;

import com.academy.model.Book;
import com.academy.service.BookService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class BooksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService = new BookService();

        List<Book> books = bookService.getBooks();

        request.setAttribute("books", books);

        request.getRequestDispatcher("/WEB-INF/jsp/books.jsp").forward(request, response);
    }
}
