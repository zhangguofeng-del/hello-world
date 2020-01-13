package com.colin.bean;

public class BlogClass
{
    public BlogClass(User user, int blogId, String blogClass, int userId)
    {
        this.user = user;
        this.blogId = blogId;
        this.blogClass = blogClass;
        this.userId = userId;
    }

    public BlogClass(User user, int blogId, String blogClass, int userId, int selfCount)
    {
        this.user = user;
        this.blogId = blogId;
        this.blogClass = blogClass;
        this.userId = userId;
        this.selfCount = selfCount;
    }

    public BlogClass(int blogId, String blogClass, int selfCount)
    {
        this.blogId = blogId;
        this.blogClass = blogClass;
        this.selfCount = selfCount;
    }

    public BlogClass()
    {
    }

    private User user;
    private int blogId;
    private String blogClass;
    private int userId;
    private int selfCount;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public int getBlogId()
    {
        return blogId;
    }

    public void setBlogId(int userId)
    {
        this.blogId = blogId;
    }

    public String getBlogClass()
    {
        return blogClass;
    }

    public void setBlogClass(String blogClass)
    {
        this.blogClass = blogClass;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public int getSelfCount()
    {
        return selfCount;
    }

    public void setSelfCount(int selfCount)
    {
        this.selfCount = selfCount;
    }
}
