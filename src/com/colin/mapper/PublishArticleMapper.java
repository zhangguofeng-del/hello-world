package com.colin.mapper;

import com.colin.bean.BlogClass;
import com.colin.bean.Book;

import java.util.List;

public interface PublishArticleMapper
{
    void insertBook(Book book);

    List<BlogClass> selectClassify(int id);

    void insertYesOrNoClassify(String classify, int id);
}
