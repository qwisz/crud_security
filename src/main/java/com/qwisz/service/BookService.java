package com.qwisz.service;

import com.qwisz.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    void updateBook(Book book, Long id);

    void removeBook(Long id);

    Book getBookById(Long id);

    List<Book> listBooks();
}
