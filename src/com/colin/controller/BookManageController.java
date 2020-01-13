package com.colin.controller;

import com.colin.bean.BlogClass;
import com.colin.bean.Book;
import com.colin.bean.PageBean;
import com.colin.service.BookManageService;
import com.colin.service.PublishArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bookManage")
public class BookManageController
{
    @Autowired
    BookManageService bookManageService;
    @Autowired
    PublishArticleService publishArticleService;
    @RequestMapping("/showAllBook")
    public String showAllBook(Model model, String currentPage, Integer id)
    {
        if (currentPage == null || "".equals(currentPage.trim())) {
            currentPage = "1";
        }
        int currentPage1 = Integer.parseInt(currentPage);
        PageBean<Book> pageBean = new PageBean<Book>();
        pageBean.setCurrentPage(currentPage1);
        bookManageService.selectAllBook(pageBean,id);
        model.addAttribute("pageBean", pageBean);
        return "wzgl";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(Integer id, Integer uId)
    {
        bookManageService.deleteBook(id);
        return "forward:/bookManage/showAllBook?id="+ uId;
    }

    @RequestMapping("/updateBook")
    public String updateBook(Integer id, Integer uId, Model model)
    {
        Book book = bookManageService.selectBook(id);
        List<BlogClass> classList = publishArticleService.selectClassify(uId);
        model.addAttribute("list", classList);
        model.addAttribute("book", book);
        return "updateBook";
    }

    @RequestMapping("/doUpdate")
    public String doUpdate(Book book, Integer uId)
    {
        bookManageService.updateBook(book);
        return "forward:/bookManage/showAllBook?id=" + uId;
    }

    @RequestMapping("/yuLan")
    public String yuLan(Integer id, Model model)
    {
        Book book = bookManageService.selectBook(id);
        model.addAttribute("book", book);
        return "yuLanBook";
    }
}
