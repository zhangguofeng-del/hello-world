package com.colin.service.impl;

import com.colin.bean.Book;
import com.colin.bean.PageBean;
import com.colin.mapper.BookManageMapper;
import com.colin.service.BookManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookManageServiceImpl implements BookManageService
{
    @Autowired
    BookManageMapper bookManageMapper;
    @Override
    public void selectAllBook(PageBean<Book> pageBean, Integer id)
    {
        int totalCount = bookManageMapper.getBookTotalCount(id);
        pageBean.setTotalCount(totalCount);
        if (pageBean.getCurrentPage() <= 0) {
            pageBean.setCurrentPage(1);
        } else if (pageBean.getCurrentPage() > pageBean.getTotalPage()) {
            pageBean.setCurrentPage(pageBean.getTotalPage());
        }
        int currentPage = pageBean.getCurrentPage();
        int index = (currentPage - 1) * pageBean.getPageCount();    // 查询的起始行
        int count = pageBean.getPageCount();
        List<Book> list = bookManageMapper.selectAllBook(index, count, id);
        pageBean.setPageData(list);
    }

    @Override
    public void deleteBook(int id)
    {
        bookManageMapper.deleteBook(id);
    }

    @Override
    public Book selectBook(Integer id)
    {
        return bookManageMapper.selectBook(id);
    }

    @Override
    public void updateBook(Book book)
    {
        bookManageMapper.updateBook(book);
    }

    @Override
    public void updatePageView(Integer id)
    {
        bookManageMapper.updatePageView(id);
    }

}
