package com.colin.mapper;

import com.colin.bean.User;

public interface UserSetMapper
{
    User selectSelfUser(int id);

    void updateUser1(String userName, String userMail, Integer id);

    void updateUser2(String userNewPassword, Integer id);

    Boolean selectUserByIdAndPassword(String userOldPassword, Integer id);
}
