package com.colin.bean;

public class Guest
{
    public Guest(User user, int guestId, String guestCreateTime, String words, int targetId)
    {
        this.user = user;
        this.guestId = guestId;
        this.guestCreateTime = guestCreateTime;
        this.words = words;
        this.targetId = targetId;
    }

    public Guest(User user, int guestId, String guestCreateTime, String words, int userId, int targetId)
    {
        this.user = user;
        this.guestId = guestId;
        this.guestCreateTime = guestCreateTime;
        this.words = words;
        this.userId = userId;
        this.targetId = targetId;
    }

    public Guest(User user, int guestId, String guestCreateTime, String words, int userId, String userName, int targetId)
    {
        this.user = user;
        this.guestId = guestId;
        this.guestCreateTime = guestCreateTime;
        this.words = words;
        this.userId = userId;
        this.userName = userName;
        this.targetId = targetId;
    }

    public Guest()
    {
    }

    private User user;
    private int guestId;
    private String guestCreateTime;
    private String words;
    private int userId;
    private String userName;
    private int targetId;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public int getGuestId()
    {
        return guestId;
    }

    public void setGuestId(int guestId)
    {
        this.guestId = guestId;
    }

    public String getWords()
    {
        return words;
    }

    public void setWords(String words)
    {
        this.words = words;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getGuestCreateTime()
    {
        return guestCreateTime;
    }

    public void setGuestCreateTime(String guestCreateTime)
    {
        this.guestCreateTime = guestCreateTime;
    }

    public int getTargetId()
    {
        return targetId;
    }

    public void setTargetId(int targetId)
    {
        this.targetId = targetId;
    }
}
