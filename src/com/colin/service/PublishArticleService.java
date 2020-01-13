package com.colin.service;

import com.colin.bean.BlogClass;
import com.colin.bean.Book;

import java.util.List;

public interface PublishArticleService
{
    //    void insertBook(String title, String label, String classify, String words, int id);
    void insertBook(Book book);

    List<BlogClass> selectClassify(int id);

    void insertYesOrNoClassify(String classify, int id);
}
