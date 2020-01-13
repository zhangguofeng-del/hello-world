package com.colin.service;

import com.colin.bean.User;

public interface UserSetService
{
    User selectSelfUser(int id);

    void updateUser1(String userName, String userMail, Integer id);

    void updateUser2(String userNewPassword, Integer id);

    Boolean selectUserByIdAndPassword(String userOldPassword, Integer id);
}
