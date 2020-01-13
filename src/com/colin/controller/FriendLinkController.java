package com.colin.controller;

import com.colin.bean.FriendLink;
import com.colin.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/friendLink")
public class FriendLinkController
{
    @Autowired
    FriendLinkService friendLinkService;

    @RequestMapping("/selectFriendLink")
    public String selectFriendLink(Integer id, Model model)
    {
        List<FriendLink> list = friendLinkService.selectFriendLink(id);
        model.addAttribute("list", list);
        return "friend";
    }

    @RequestMapping("/insertFriendLink")
    public String insertFriendLink(FriendLink friendLink)
    {
        friendLinkService.insertFriendLink(friendLink);
        return "forward:/friendLink/selectFriendLink?id=" + friendLink.getUserId();
    }

    @RequestMapping("/updateFriendLink")
    public String updateFriendLink(Integer id, Integer uId, Model model)
    {
        FriendLink friendLink = friendLinkService.selectFriendLink2(id);
        List<FriendLink> list = friendLinkService.selectFriendLink(uId);
        model.addAttribute("list", list);
        model.addAttribute("friendLink", friendLink);
        return "friend2";
    }

    @RequestMapping("/doUpdateFriendLink")
    public String doUpdateFriendLink(FriendLink friendLink)
    {
        friendLinkService.updateFriendLink(friendLink);
        return "forward:/friendLink/selectFriendLink?id=" + friendLink.getUserId();
    }

    @RequestMapping("/deleteFriendLink")
    public String deleteFriendLink(Integer id, Integer uId)
    {
        friendLinkService.deleteFriendLink(id);
        return "forward:/friendLink/selectFriendLink?id=" + uId;
    }
}
