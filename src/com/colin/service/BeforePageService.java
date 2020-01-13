package com.colin.service;

import com.colin.bean.Book;
import com.colin.bean.FriendLink;
import com.colin.bean.PageBean;

import java.util.List;

public interface BeforePageService
{
    void selectAllBooks(PageBean<Book> pageBean);

    void selectBookTitle(PageBean<Book> pageBean, String title);

    void selectAllFriendLink(PageBean<FriendLink> pageBean);

    void selectFriendLinkTitile(PageBean<FriendLink> pageBean, String checkLink);

    void insertGuest(String guest, Integer id, Integer idtwo, String date);
}
