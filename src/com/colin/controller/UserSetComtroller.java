package com.colin.controller;

import com.colin.bean.User;
import com.colin.service.UserSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userSet")
public class UserSetComtroller
{
    @Autowired
    UserSetService userSetService;

    @RequestMapping("/selectInformation")
    public String selectInformation(Integer id, Model model)
    {
        User user = userSetService.selectSelfUser(id);
        model.addAttribute("user", user);
        return "xtsz";
    }

    @RequestMapping("/doUpateUser1")
    public String doUpateUser1(String userName, String userMail, Integer id, Model model)
    {
        userSetService.updateUser1(userName, userMail, id);
        model.addAttribute("check1", "修改成功");
        return "xtsz";
    }

    @RequestMapping("/doUpateUser2")
    public String doUpateUser2(String userOldPassword, String userNewPassword, Integer id, Model model)
    {
        Boolean flag = userSetService.selectUserByIdAndPassword(userOldPassword, id);
        if (flag) {
            userSetService.updateUser2(userNewPassword, id);
            model.addAttribute("check2", "修改成功");
        }
        else {
            model.addAttribute("check2", "输入不一致");
        }
        return "xtsz";
    }
}
