package com.colin.service.impl;

import com.colin.bean.User;
import com.colin.mapper.UserSetMapper;
import com.colin.service.UserSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSetServiceImpl implements UserSetService
{
    @Autowired
    UserSetMapper userSetMapper;

    @Override
    public User selectSelfUser(int id)
    {
        return userSetMapper.selectSelfUser(id);
    }

    @Override
    public void updateUser1(String userName, String userMail, Integer id)
    {
        userSetMapper.updateUser1(userName, userMail, id);
    }

    @Override
    public void updateUser2(String userNewPassword, Integer id)
    {
        userSetMapper.updateUser2(userNewPassword, id);
    }

    @Override
    public Boolean selectUserByIdAndPassword(String userOldPassword, Integer id)
    {
        return userSetMapper.selectUserByIdAndPassword(userOldPassword, id);
    }

}
