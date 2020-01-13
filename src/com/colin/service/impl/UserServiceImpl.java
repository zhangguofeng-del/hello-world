package com.colin.service.impl;

import com.colin.bean.User;
import com.colin.mapper.UserMapper;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectUserForLogin(User user)
    {
        return userMapper.selectUserForLogin(user);
    }

    @Override
    public int addUser(User user)
    {
        return userMapper.addUser(user);
    }
}
