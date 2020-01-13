package com.colin.service;

import com.colin.bean.BlogClass;

import java.util.List;

public interface ClassifyAndLabelService
{
    List<BlogClass> selectClassifyName(int id);

    int selectLabelCount(int id);

    List<BlogClass> selectCountOfClass(int id);

    void deleteClassify(String className, int id);

    String selectBlogName(int blogId);

    void insertClassify(String name, int id);
}
