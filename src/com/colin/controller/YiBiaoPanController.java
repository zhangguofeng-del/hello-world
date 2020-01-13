package com.colin.controller;

import com.colin.bean.Book;
import com.colin.bean.Guest;
import com.colin.service.YiBiaoPanService;
import com.colin.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/yiBiaoPan")
public class YiBiaoPanController
{
    @Autowired
    YiBiaoPanService yiBiaoPanService;
    @RequestMapping("/selectData")
    public String selectData(Integer id, Model model) throws ParseException
    {
        int bookCount = yiBiaoPanService.selectBookCount(id);
        int guestCount = yiBiaoPanService.selectGuestCount(id);
        int fileCount = yiBiaoPanService.selectFileCount(id);
        int friendLinkCount = yiBiaoPanService.selectFriendLinkCount(id);
        List<Book> bookList = yiBiaoPanService.selectBook(id);
        List<Guest> guestList = yiBiaoPanService.selectGuest(id);
        for (Guest param : guestList) {
            param.setGuestCreateTime(new SimpleDateFormat("yy/MM/dd/ HH时mm分").format(DateUtil.parseTime2(param.getGuestCreateTime())));
        }
//        List<Guest> guestList1 = yiBiaoPanService.selectGuestUserName(guestList);
        model.addAttribute("bookCount", bookCount);
        model.addAttribute("guestCount", guestCount);
        model.addAttribute("fileCount", fileCount);
        model.addAttribute("friendLinkCount", friendLinkCount);
        model.addAttribute("bookList", bookList);
        model.addAttribute("guestList1", guestList);
        return "ybb";
    }
}
