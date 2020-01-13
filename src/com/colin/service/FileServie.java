package com.colin.service;

import com.colin.bean.MyFile;

import java.util.List;

public interface FileServie
{
    void insertFile(String path, int id);

    List<MyFile> selectFile(int id);

    void deleteFile(int id);

    String selectFile2(int id);
}
