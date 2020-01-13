package com.colin.mapper;

import com.colin.bean.Book;
import com.colin.bean.FriendLink;

import java.util.List;

public interface BeforePageMapper
{
    List<Book> selectAllBooks(int index, int count);

    int getBookTotalCount();

    List<FriendLink> selectAllFriendLink(int index, int count);

    List<Book> selectBookTitle(String title, int index, int count);

    int getLinkTotalCount();

    List<FriendLink> selectFriendLinkTitile(String checkLink, int index, int count);

    void insertGuest(String guest, Integer id, Integer idtwo, String date);
}
