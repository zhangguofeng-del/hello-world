package com.colin.service.impl;

import com.colin.bean.BlogClass;
import com.colin.mapper.ClassifyAndLabelMapper;
import com.colin.service.ClassifyAndLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClassifyAndLabelServiceImpl implements ClassifyAndLabelService
{
    @Autowired
    ClassifyAndLabelMapper classifyAndLabelMapper;
    @Override
    public List<BlogClass> selectClassifyName(int id)
    {
        return classifyAndLabelMapper.selectClassifyName(id);
    }

    @Override
    public int selectLabelCount(int id)
    {
        return classifyAndLabelMapper.selectLabelCount(id);
    }

    @Override
    public List<BlogClass> selectCountOfClass(int id)
    {
        List<BlogClass> list = classifyAndLabelMapper.selectClassifyName(id);
        for (BlogClass param : list) {
            int count = classifyAndLabelMapper.selectCountOfClass(param.getBlogClass(), id);
            param.setSelfCount(count);
        }
        return list;
    }

    @Override
    public void deleteClassify(String className, int id)
    {
        classifyAndLabelMapper.deleteClassify(className, id);
    }

    @Override
    public String selectBlogName(int blogId)
    {
        return classifyAndLabelMapper.selectBlogName(blogId);
    }

    @Override
    public void insertClassify(String name, int id)
    {
        classifyAndLabelMapper.insertClassify(name, id);
    }
}
