package com.colin.mapper;

import com.colin.bean.FriendLink;

import java.util.List;

public interface FriendLinkMapper
{
    void insertFriendLink(FriendLink friendLink);

    List<FriendLink> selectFriendLink(int id);

    FriendLink selectFriendLink2(int id);

    void updateFriendLink(FriendLink friendLink);

    void deleteFriendLink(Integer id);
}
