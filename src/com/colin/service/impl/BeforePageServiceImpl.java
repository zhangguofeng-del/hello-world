package com.colin.service.impl;

import com.colin.bean.Book;
import com.colin.bean.FriendLink;
import com.colin.bean.PageBean;
import com.colin.mapper.BeforePageMapper;
import com.colin.service.BeforePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BeforePageServiceImpl implements BeforePageService
{
    @Autowired
    BeforePageMapper beforePageMapper;
    @Override
    public void selectAllBooks(PageBean<Book> pageBean)
    {
        int totalCount = beforePageMapper.getBookTotalCount();
        pageBean.setTotalCount(totalCount);
        if (pageBean.getCurrentPage() <= 0) {
            pageBean.setCurrentPage(1);
        } else if (pageBean.getCurrentPage() > pageBean.getTotalPage()) {
            pageBean.setCurrentPage(pageBean.getTotalPage());
        }
        int currentPage = pageBean.getCurrentPage();
        int index = (currentPage - 1) * pageBean.getPageCount();    // 查询的起始行
        int count = pageBean.getPageCount();
        List<Book> list = beforePageMapper.selectAllBooks(index, count);
        pageBean.setPageData(list);
    }

    @Override
    public void selectBookTitle(PageBean<Book> pageBean, String title)
    {
        List<Book> list = new ArrayList<>();
        int totalCount = beforePageMapper.getBookTotalCount();
        pageBean.setTotalCount(totalCount);
        if (pageBean.getCurrentPage() <= 0) {
            pageBean.setCurrentPage(1);
        } else if (pageBean.getCurrentPage() > pageBean.getTotalPage()) {
            pageBean.setCurrentPage(pageBean.getTotalPage());
        }
        int currentPage = pageBean.getCurrentPage();
        int index = (currentPage - 1) * pageBean.getPageCount();    // 查询的起始行
        int count = pageBean.getPageCount();
        list = beforePageMapper.selectBookTitle(title, index, count);
        pageBean.setPageData(list);
    }

    @Override
    public void selectAllFriendLink(PageBean<FriendLink> pageBean)
    {
        int totalCount = beforePageMapper.getLinkTotalCount();
        pageBean.setTotalCount(totalCount);
        if (pageBean.getCurrentPage() <= 0) {
            pageBean.setCurrentPage(1);
        }
        else if (pageBean.getCurrentPage() > pageBean.getTotalPage()) {
            pageBean.setCurrentPage(pageBean.getTotalPage());
        }
        int currentPage = pageBean.getCurrentPage();
        int index = (currentPage - 1) * pageBean.getPageCount();    // 查询的起始行
        int count = pageBean.getPageCount();
        List<FriendLink> list = beforePageMapper.selectAllFriendLink(index, count);
        pageBean.setPageData(list);
    }

    @Override
    public void selectFriendLinkTitile(PageBean<FriendLink> pageBean, String checkLink)
    {
        List<FriendLink> list = new ArrayList<>();
        int totalCount = beforePageMapper.getBookTotalCount();
        pageBean.setTotalCount(totalCount);
        if (pageBean.getCurrentPage() <= 0) {
            pageBean.setCurrentPage(1);
        } else if (pageBean.getCurrentPage() > pageBean.getTotalPage()) {
            pageBean.setCurrentPage(pageBean.getTotalPage());
        }
        int currentPage = pageBean.getCurrentPage();
        int index = (currentPage - 1) * pageBean.getPageCount();    // 查询的起始行
        int count = pageBean.getPageCount();
        list = beforePageMapper.selectFriendLinkTitile(checkLink, index, count);
        pageBean.setPageData(list);
    }

    @Override
    public void insertGuest(String guest, Integer id, Integer idtwo, String date)
    {
        beforePageMapper.insertGuest(guest, id, idtwo, date);
    }

}
