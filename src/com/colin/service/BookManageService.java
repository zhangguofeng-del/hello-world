package com.colin.service;

import com.colin.bean.Book;
import com.colin.bean.PageBean;

public interface BookManageService
{
    void selectAllBook(PageBean<Book> pageBean, Integer id);

    void deleteBook(int id);

    Book selectBook(Integer id);

    void updateBook(Book book);

    void updatePageView(Integer id);
}
