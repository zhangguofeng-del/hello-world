package com.colin.service.impl;

import com.colin.bean.MyFile;
import com.colin.mapper.FileMapper;
import com.colin.service.FileServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FileServieImpl implements FileServie
{
    @Autowired
    FileMapper fileMapper;
    @Override
    public void insertFile(String path, int id)
    {
        fileMapper.insertFile(path, id);
    }

    @Override
    public List<MyFile> selectFile(int id)
    {
        return fileMapper.selectFile(id);
    }

    @Override
    public void deleteFile(int id)
    {
        fileMapper.deleteFile(id);
    }

    @Override
    public String selectFile2(int id)
    {
        return fileMapper.selectFile2(id);
    }
}
