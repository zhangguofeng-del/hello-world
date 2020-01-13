package com.colin.mapper;

import com.colin.bean.MyFile;

import java.util.List;

public interface FileMapper
{
    void insertFile(String path, int id);

    List<MyFile> selectFile(int id);

    void deleteFile(int id);

    String selectFile2(int id);
}
