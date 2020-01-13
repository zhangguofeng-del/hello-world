package com.colin.mapper;

import com.colin.bean.Book;

import java.util.List;

public interface BookManageMapper
{
    List<Book> selectAllBook(int index, int count, int id);

    int getBookTotalCount(int id);

    void deleteBook(int id);

    Book selectBook(Integer id);

    void updateBook(Book book);

    void updatePageView(int id);
}
