package com.colin.controller;

import com.colin.bean.Book;
import com.colin.bean.FriendLink;
import com.colin.bean.PageBean;
import com.colin.service.BeforePageService;
import com.colin.service.BookManageService;
import com.colin.service.FriendLinkService;
import com.colin.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/beforePage")
public class BeforePageController
{
    @Autowired
    BeforePageService beforePageService;
    @Autowired
    BookManageService bookManageService;
    @RequestMapping("/selectAllBooks")
    public String selectAllBooks(Model model, String currentPage)
    {
        if (currentPage == null || "".equals(currentPage.trim())) {
            currentPage = "1";
        }
        int currentPage1 = Integer.parseInt(currentPage);
        PageBean<Book> pageBean = new PageBean<Book>();
        pageBean.setCurrentPage(currentPage1);
        pageBean.setPageCount(9);
        beforePageService.selectAllBooks(pageBean);
        model.addAttribute("pageBean", pageBean);
        return "taleBlog";
    }

    @RequestMapping("/selectFriendLink")
    public String selectFriendLink(Model model, String currentPage)
    {
        if (currentPage == null || "".equals(currentPage.trim())) {
            currentPage = "1";
        }
        int currentPage1 = Integer.parseInt(currentPage);
        PageBean<FriendLink> pageBean = new PageBean<FriendLink>();
        pageBean.setCurrentPage(currentPage1);
        pageBean.setPageCount(9);
        beforePageService.selectAllFriendLink(pageBean);
        model.addAttribute("pageBean", pageBean);
        return "taleBlog2";
    }

    @RequestMapping("/selectBookTitle")
    public String selectBookTitle(Model model, String currentPage, String checkArticle)
    {
        if (currentPage == null || "".equals(currentPage.trim())) {
            currentPage = "1";
        }
        int currentPage1 = Integer.parseInt(currentPage);
        PageBean<Book> pageBean = new PageBean<Book>();
        pageBean.setCurrentPage(currentPage1);
        pageBean.setPageCount(9);
        beforePageService.selectBookTitle(pageBean, checkArticle);
        model.addAttribute("pageBean",pageBean);
        return "taleBlog";
    }

    @RequestMapping("/selectFriendLinkTitile")
    public String selectFriendLinkTitile(Model model, String currentPage, String checkLink)
    {
        if (currentPage == null || "".equals(currentPage.trim())) {
            currentPage = "1";
        }
        int currentPage1 = Integer.parseInt(currentPage);
        PageBean<FriendLink> pageBean = new PageBean<FriendLink>();
        pageBean.setCurrentPage(currentPage1);
        pageBean.setPageCount(9);
        beforePageService.selectFriendLinkTitile(pageBean, checkLink);
        model.addAttribute("pageBean",pageBean);
        return "taleBlog2";
    }

    @RequestMapping("/showBook")
    public String showBook(Integer id, Model model)
    {
        Book book = bookManageService.selectBook(id);
        bookManageService.updatePageView(id);
        model.addAttribute("book", book);
        return "thisArticle";
    }

    @RequestMapping("/insertGuest")
    public String insertGuest(String guest, Integer id, Integer targetId)
    {
        String date = DateUtil.parseTime();
        beforePageService.insertGuest(guest, id, targetId, date);
        return "forward:/beforePage/selectAllBooks";
    }
}
