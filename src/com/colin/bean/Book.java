package com.colin.bean;

public class Book
{
    /**
     * 文章
     * @param user 关联用户
     * @param id 文章编号
     * @param title 标题
     * @param label 标签
     * @param createtime 发布时间
     * @param pageview 浏览量
     * @param classify 分类
     * @param words 文章内容
     * @param userId 用户号
     */
    public Book(User user, int id, String title, String label, String createtime, int pageview, String classify, String words, int userId)
    {
        this.user = user;
        this.id = id;
        this.title = title;
        this.label = label;
        this.createtime = createtime;
        this.pageview = pageview;
        this.classify = classify;
        this.words = words;
        this.userId = userId;
    }

    public Book(User user, int id, String title, String label, String createtime, int pageview, String classify, String words)
    {
        this.user = user;
        this.id = id;
        this.title = title;
        this.label = label;
        this.createtime = createtime;
        this.pageview = pageview;
        this.classify = classify;
        this.words = words;
    }

    public Book()
    {
    }
    private User user;
    private int id;
    private String title;
    private String label;
    private String createtime;
    private int pageview;
    private String classify;
    private String words;
    private int userId;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getCreatetime()
    {
        return createtime;
    }

    public void setCreatetime(String createtime)
    {
        this.createtime = createtime;
    }

    public int getPageview()
    {
        return pageview;
    }

    public void setPageview(int pageview)
    {
        this.pageview = pageview;
    }

    public String getClassify()
    {
        return classify;
    }

    public void setClassify(String classify)
    {
        this.classify = classify;
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
}
