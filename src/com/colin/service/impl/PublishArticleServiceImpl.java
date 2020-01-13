package com.colin.service.impl;

import com.colin.bean.BlogClass;
import com.colin.bean.Book;
import com.colin.mapper.PublishArticleMapper;
import com.colin.service.PublishArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublishArticleServiceImpl implements PublishArticleService
{
    @Autowired
    PublishArticleMapper publishArticleMapper;
    @Override
    public void insertBook(Book book)
    {
        publishArticleMapper.insertBook(book);
    }

    @Override
    public List<BlogClass> selectClassify(int id)
    {
        return publishArticleMapper.selectClassify(id);
    }

    @Override
    public void insertYesOrNoClassify(String classify, int id)
    {

    }
}
