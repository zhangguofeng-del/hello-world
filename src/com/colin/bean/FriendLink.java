package com.colin.bean;

public class FriendLink
{
    public FriendLink(int id, String linkName, String linkPath, int userId)
    {
        this.id = id;
        this.linkName = linkName;
        this.linkPath = linkPath;
        this.userId = userId;
    }

    public FriendLink()
    {
    }

    private int id;
    private String linkName;
    private String linkPath;
    private int userId;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getLinkName()
    {
        return linkName;
    }

    public void setLinkName(String linkName)
    {
        this.linkName = linkName;
    }

    public String getLinkPath()
    {
        return linkPath;
    }

    public void setLinkPath(String linkPath)
    {
        this.linkPath = linkPath;
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
