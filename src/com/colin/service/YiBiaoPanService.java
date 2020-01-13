package com.colin.service;

import com.colin.bean.Book;
import com.colin.bean.Guest;

import java.text.ParseException;
import java.util.List;

public interface YiBiaoPanService
{
    int selectBookCount(int id);

    int selectGuestCount(int id);

    int selectFileCount(int id);

    int selectFriendLinkCount(int id);

    List<Book> selectBook(int id);

    List<Guest> selectGuest(int id);

    List<Guest> selectGuestUserName(List<Guest> list) throws ParseException;

    void insertGuest(String createTime, String guest, int userId, int targetId);
}
