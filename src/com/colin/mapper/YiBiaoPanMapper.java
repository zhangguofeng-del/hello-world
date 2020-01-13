package com.colin.mapper;

import com.colin.bean.Book;
import com.colin.bean.Guest;
import com.colin.bean.User;

import java.util.List;

public interface YiBiaoPanMapper
{
    int selectBookCount(int id);

    int selectGuestCount(int id);

    int selectFileCount(int id);

    int selectFriendLinkCount(int id);

    List<Book> selectBook(int id);

    List<Guest> selectGuest(int id);

    User selectGuestUserName(int id);

    void insertGuest(String CreateTime, String guest, int userId, int targetId);
}
