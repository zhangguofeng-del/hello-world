package com.colin.mapper;

import com.colin.bean.User;

public interface UserMapper
{
    User selectUserForLogin(User user);

    int addUser(User user);
}
