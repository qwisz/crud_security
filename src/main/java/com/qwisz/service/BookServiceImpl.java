package com.qwisz.service;

import com.qwisz.dao.BookDao;
import com.qwisz.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void addBook(Book book) {
        bookDao.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.save(book);
    }

    @Override
    public void removeBook(Long id) {
        bookDao.deleteById(id);
    }

    @Override
    public Book getBookById(Long id) {
        return bookDao.findById(id).get();
    }

    @Override
    public List<Book> listBooks() {
        List<Book> books = new ArrayList<>();
        bookDao.findAll().forEach(books::add);
        return books;
    }
}
