package com.academy.service;

import com.academy.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books;

    public BookService() {
        books = new ArrayList<>();

        Book book = new Book(1, "Title1", 1900);
        Book book1 = new Book(2, "Title2", 1901);
        Book book2 = new Book(3, "Title3", 2000);
        Book book3 = new Book(4, "Title4", 1900);

        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getById(Integer id) {
        for (Book book : books) {
          if (book.getId().equals(id)) {
              return book;
          }
        };

        return null;
    }
}
