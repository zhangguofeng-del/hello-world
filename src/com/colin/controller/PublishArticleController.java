package com.colin.controller;

import com.colin.bean.BlogClass;
import com.colin.bean.Book;
import com.colin.service.PublishArticleService;
import com.colin.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/publishArticle")
public class PublishArticleController
{
    @Autowired
    PublishArticleService publishArticleService;
    @RequestMapping("/showData")
    public String showData(Integer id, Model model)
    {
        List<BlogClass> classList = publishArticleService.selectClassify(id);
        model.addAttribute("list", classList);
        return "fbwz";
    }

    @RequestMapping("/insertBook")
    public String insertBook(Book book)
    {
        book.setCreatetime(DateUtil.parseTime());
        book.setPageview(0);
        publishArticleService.insertBook(book);
        return "forward:/bookManage/showAllBook?id=" + book.getUserId();
    }
}
