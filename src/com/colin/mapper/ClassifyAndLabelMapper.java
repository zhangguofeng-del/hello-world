package com.colin.mapper;

import com.colin.bean.BlogClass;

import java.util.List;

public interface ClassifyAndLabelMapper
{
    List<BlogClass> selectClassifyName(int id);

    int selectLabelCount(int id);

    int selectCountOfClass(String className, int id);

    void deleteClassify(String className, int id);

    String selectBlogName(int blogId);

    void insertClassify(String name, int id);

    List<Integer> selectBolgId(int id);
}
