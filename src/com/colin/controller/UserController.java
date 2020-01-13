package com.colin.controller;

import com.colin.bean.User;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(HttpSession httpSession, User user)
    {
        User loginUser = userService.selectUserForLogin(user);
        if (loginUser != null) {
            httpSession.setAttribute("loginUser", loginUser);
            return "loginSuccess";
        }
        else {
            return "check";
        }
    }

    @RequestMapping("/register")
    public String register()
    {
        return "register";
    }

    @RequestMapping("/doRegister")
    public String doRegister(User user)
    {
        int i = userService.addUser(user);
        if (i == 1) {
            return "check2";
        }
        else {
            return "check3";
        }
    }

}
