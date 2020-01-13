package com.colin.bean;

public class MyFile
{
    public MyFile(int fileId, String fileName, int userId)
    {
        this.fileId = fileId;
        this.fileName = fileName;
        this.userId = userId;
    }

    public MyFile()
    {
    }

    private int fileId;
    private String fileName;
    private int userId;

    public int getFileId()
    {
        return fileId;
    }

    public void setFileId(int fileId)
    {
        this.fileId = fileId;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }
}
