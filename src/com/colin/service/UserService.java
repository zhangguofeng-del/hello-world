package com.colin.service;

import com.colin.bean.User;

public interface UserService
{
    User selectUserForLogin(User user);

    int addUser(User user);
}
